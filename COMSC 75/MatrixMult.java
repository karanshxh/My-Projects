/* Karan Shah
 * MatrixMult
 * Ask for two matrices using a method
 * Multiply them
 * Print resulting matrix using another method
 */

// Import necessary tools
import java.util.Scanner;

public class MatrixMult {

public static Scanner input = new Scanner(System.in);

// Method for taking user input for matrix
public static double[][] inputmatrix() {
    System.out.print("Enter number of rows: ");
    int num_rows = input.nextInt();
    System.out.print("Enter number of columns: ");
    int num_columns = input.nextInt();
    double[][] tmp_matrix = new double[num_rows][num_columns];
    System.out.print("Enter contents by row: ");
    for (int a = 0; a < num_rows; a++) {
        for (int b = 0; b < num_columns; b++) {
            double input_num = input.nextDouble();
            tmp_matrix[a][b] = input_num;
        }
    }
    return tmp_matrix;
}

// Method for getting sum of all the rows
public static void getsum(int row, double matrixa[][], 
double matrixb[][], double matrixc[][]) {
    double total_sum = 0;
    for (int i = 0; i < matrixb[0].length; i++) {
        for (int j = 0; j < matrixb.length; j++) {
            double sum = matrixa[row][j] * matrixb[j][i];
            total_sum += sum;
        }
        matrixc[row][i] = total_sum;
        total_sum = 0;
    }
}

// Method for multiplying the matrix
public static double[][] mult_matrix(double matrixa[][], double matrixb[][]) {
    double[][] matrixc = new double [matrixa.length][matrixb[0].length];

    for (int i = 0; i < matrixa.length; i++) {
        getsum(i, matrixa, matrixb,matrixc);
    }
    for (int i = 0; i < matrixa.length; i++) {
        for (int j = 0; j < matrixb[0].length; j++) {
            System.out.print(matrixc[i][j] + " ");
        }
        System.out.println("");
    }
    return matrixc;
}


public static void main(String[] args) {

// Matrix A
System.out.println("Matrix A");
double matrixa[][] = inputmatrix();

// Matrix B
System.out.println("Matrix B");
double matrixb[][] = inputmatrix();

// See if it is a compatible matrix
if (matrixa[0].length != matrixb.length) {
    System.out.println("The number of columns in Matrix A " +
    "must be equal to the number of rows in Matrix B.");
}

// Call method - it is a valid method
else {
    double matrixc[][] = mult_matrix(matrixa, matrixb);
}

}

}