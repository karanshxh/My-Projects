/* Karan Shah
 * AreaTriangle
 * Ask for 3 coordinates and find the area of the triangle
 */
 
// Import Scanner for input
import java.util.Scanner;
//Import Math Function for square roots
import java.lang.Math;

public class AreaTriangle {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
	// Input prompt
    System.out.print("Enter the coordinates of three points separated by spaces"
    + "\nin the order x1 y1 x2 y2 x3 y3: ");

	// Double coordinate inputs
    double x1 = myObj.nextDouble();
	double y1 = myObj.nextDouble();
	double x2 = myObj.nextDouble();
	double y2 = myObj.nextDouble();
	double x3 = myObj.nextDouble();
	double y3 = myObj.nextDouble();

	// Solve for 3 side lengths
    double sideA = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
    double sideB = Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3),2));
    double sideC = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2));
	
	// Solve for Semiperimeter
	double semiperimeter = ((sideA + sideB + sideC)/2);
	
	// Solve for Area
	double area = Math.sqrt(semiperimeter * (semiperimeter-sideA) *
	(semiperimeter-sideB) * (semiperimeter-sideC));
	
	// Round and print final area
	System.out.println("The area of the triangle is " + 
	(int)(area * 10)/10.0 + " square units.");
  }
}
