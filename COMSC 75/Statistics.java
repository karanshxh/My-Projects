/* Karan Shah
 * Statistics
 * Prompt user to enter dollar amounts
 * Calculate the mean and standard deviation
 * End when user enters $-1
 */
 
// Import Scanner for input
import java.util.Scanner;
public class Statistics {
	
	// Method to calculate standard deviation
	public static double calc_std_dev(int count,double price_sum,double price_sum_square, double avg) {
		double numer = ((count * price_sum_square) - (price_sum * price_sum));
		double denom = (count * (count - 1)); 
		double dev = Math.sqrt(numer/denom);
		return dev;
	}	

    public static void main(String[] args) {

	// Define variables for method
	double price;
	int count = 0;
	double price_sum = 0;
	double price_sum_square = 0;
	double avg = 0;
	
    Scanner input = new Scanner(System.in);
    
    // Take input values until user enters -1
	do { // Do as many times until user enters 0
			System.out.print("Enter a price, or $-1 to quit:  ");
			price = input.nextDouble();
			if (price != -1) {
				count += 1;
				price_sum += price;
				price_sum_square += price * price;
			}
					    
	} while (price != -1);
	
	// Print number of items
	System.out.println("Number of items: " + count);
	
	// Calculate mean
	avg = price_sum / count;
	
	//Determine what to print based on number of inputs
	if (count < 1) {
		System.out.println("No data entered. Cannot calculate " + 
						   "statistics.");
		System.exit(0);
	}
	
	else if (count == 1) {
		System.out.format("Average price is $%2.2f\n", avg);
		System.out.println("Cannot calculate standard deviation " + 
						   "for one item.");
		System.exit(0);
	}
	
	else {
		double dev = calc_std_dev(count,price_sum,price_sum_square,avg);
		System.out.format("Average price is $%2.2f\n", avg);
		System.out.format("Standard deviation of " + 
						  "prices is $%2.2f\n", dev);
	}
  }
}
