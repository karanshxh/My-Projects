/* Karan Shah
 * Pizza
 * Prompt user to enter length and width of a pizza
 * Prompt user to enter number of toppings for pizza
 * Return size of pizza (If positive)
 * Return cost of pizza
 */
 
// Import Scanner for input
import java.util.Scanner;

public class Pizza {
  public static void main(String[] args) {

// Take input values
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter length of pizza in cm: ");
    int length = input.nextInt();
    
    System.out.print("Enter wdith of pizza in cm: ");
    int width = input.nextInt();
    
	System.out.print("Enter number of toppings: ");
    int toppings = input.nextInt();
    
    float cost = 0; // Define cost variable
   
    if (toppings < 0) {
		System.out.println("Number of toppings must be " +
						"greater than or equal to 0.");
		System.exit(0); // End program if number of toppings 
						// is negative
	}
						
    int area = length * width;
    if (length <= 0 || width <= 0) {
		System.out.println("The area must be greater than 0.");
		System.exit(0); // End program if length or width is 
						// less than or equal to 0
	}
	
	else {
		System.out.println("The area of your pizza is " + area +
							" square cm.");
			if (area > 1000) {
				System.out.println("We cannot make a pizza" + 
							" that large, sorry.");
				System.exit(0); // End program if area is too big
			}	
	}
	
	// Find size
	if (area <= 225) {
		System.out.println("That is a small pizza.");
		cost = 7.25f; // Add small pizza cost
	}
	else if (area <= 650) {
		System.out.println("That is a medium pizza");
		cost = 10.50f; // Add medium pizza cost
	}
	else {
		System.out.println("That is a large pizza");
		cost = 14.75f; // Add large pizza cost
	}
	cost += (toppings * 0.85); // Add topping cost to pizza cost
	
	System.out.format("Your pizza costs " + cost +
					  " euros.\n"); // Display total cost
  }
}
