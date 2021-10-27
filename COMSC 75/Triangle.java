/* Karan Shah
 * Triangle
 * Ask for 3 side lenghts of a triangle
 * Print perimeter if valid triangle
 * Or tell that it's not a valid triangle
 */
 
// Import Scanner for input
import java.util.Scanner;
//Import Math Function
import java.lang.Math;

public class Triangle {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    
// Input prompt
    System.out.print("Enter lenghts of sides of the triangle: ");

// Double side inputs
    double sidea = myObj.nextDouble();
	double sideb = myObj.nextDouble();
	double sidec = myObj.nextDouble();    

// Find Validity
	if (sideb + sidec > sidea && sidea + sidec > sideb && 
		sidea + sideb > sidec) {
		
		// Find perimeter because it is a valid triangle
		double perimeter = sidea + sideb + sidec;
		System.out.format("The perimeter of the triangle is " + 
		"%,2.1f\n", perimeter);
	}
	
		// Not a valid triangle
	else {
		System.out.println("Those sides do not make a valid triangle.");
	}
  }
}
