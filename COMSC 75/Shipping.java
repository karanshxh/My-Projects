/* Karan Shah
 * AreaTriangle
 * Ask for 3 coordinates and find the area of the triangle
 */
 
// Import Scanner for input
import java.util.Scanner;
//Import Math Function for square roots
import java.lang.Math;

public class Shipping {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
// Input prompt
    System.out.print("Enter weight of package in pounds: ");

// Double coordinate inputs
    double weightofpackage = myObj.nextDouble();
    
    double cost = 0.00;
// Determine cost of package

	// Package weight too high or low
	if (weightofpackage <= 0) {
		System.out.println("Invalid Input.");
		
	}
	else if (weightofpackage > 25) {
		System.out.println("The package cannot be shipped.");
	}
	
	// Valid package weights
	else {
		if (weightofpackage <= 2) {
			cost = 3.50;
		}
		else if (weightofpackage <= 7) {
			cost = 5.80;
		}
		else if (weightofpackage <= 15) {
			cost = 9.20;
		}
		else {
			cost = 11.75;
		}
		// Print cost of package
		System.out.format("Cost: $" + "%,2.2f\n", cost);
	}
  }
}
