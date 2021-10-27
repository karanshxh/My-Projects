/* Karan Shah
 * MergeTest
 * Ask for two lists
 * Merge them from least to greatest
 */

// Import necessary tools
import java.util.Scanner;
import java.util.ArrayList;


public class MergeTest {

	public static Scanner input = new Scanner(System.in);
	
// Method for taking input
	public static int[] inputintegers(int listlength) {
		int[] tmp_arr = new int[listlength];
		for (int i = 0; i < listlength; i++) {
		tmp_arr[i] = input.nextInt();
		}
		return tmp_arr;
	}
	
// Method for printing array
	public static void printarray(int[] parr) {
		for (int i = 0; i < parr.length; i++) {
			System.out.print(parr[i] + " ");
		}
		System.out.println("");
	}
		
	public static void main(String[] args) {
		
// List 1
		System.out.print("Enter size of list: ");
		int inputsize1 = input.nextInt();
		int[] arr1 = new int[inputsize1];
		System.out.print("Enter items in list: ");
		arr1 = inputintegers(inputsize1);
		
		
// List 2
		System.out.print("Enter size of list: ");
		int inputsize2 = input.nextInt();
		int[] arr2 = new int[inputsize2];
		System.out.print("Enter items in list: ");
		arr2 = inputintegers(inputsize2);
		
		System.out.print("List 1 is ");
		printarray(arr1);
		System.out.print("List 2 is ");
		printarray(arr2);
		
		int input1copy = 0;
		int input2copy = 0;
		int finalarrindex = 0;
		
// Compare index, the lower value gets put in a new array
		int[] finalarr = new int[inputsize1 + inputsize2];
		while (input1copy < inputsize1 && input2copy < inputsize2) {
			if (arr1[input1copy] <= arr2[input2copy]) {
				finalarr[finalarrindex] = arr1[input1copy];
				finalarrindex ++;
				input1copy ++;
			}
			
			else {
				finalarr[finalarrindex] = arr2[input2copy];
				finalarrindex ++;
				input2copy ++;
			}
		}
	
// When one array is done, input the rest of the values from other array
		while (input1copy < inputsize1) {
			finalarr[finalarrindex] = arr1[input1copy];
			finalarrindex++;
			input1copy++;
		}
		while (input2copy < inputsize2) {
			finalarr[finalarrindex] = arr2[input2copy];
			finalarrindex++;
			input2copy++;
		}
		
		
// Print the final list
		System.out.print("The merged list is ");
		printarray(finalarr);
			
			
	}
}
