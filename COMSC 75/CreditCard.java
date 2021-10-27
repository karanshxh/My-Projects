/* Karan Shah
 * CreditCard
 * Prompt user to enter a credit number
 * Set up different methods to determine if valid credit card
 * Use the Luhn Check
 */
 
// Import Scanner for input
import java.util.Scanner;

public class CreditCard {
	
	// Derive the sum of the digits
	public static int getDoubleDigitSum (int digit) {
		int doubleDigit = digit * 2;
		int result = doubleDigit / 10 + doubleDigit % 10;
		
		return result;
	}
	
	// Derive sum of digit in an even spot
	public static int sumOfDoubleEvenPlace (long number) {
		int sum = 0;
		number /= 10;
		
		while (number != 0) {
			sum += getDoubleDigitSum((int)(number % 10));
			number /= 100;
		}
		return sum;
	}
	
	// Method to get sum of odd place
	public static int getSumOfOddPlace (long number) {
		int sum = 0;
		
		while (number != 0) {
			sum += ((int)(number % 10));
			number /= 100;
		}
		return sum;
	}
	
	// Method to derive num of digits in number
	public static int getSize (long number) {
		int digitcounter = 0;
		
		while (number != 0) {
			digitcounter += 1;
			number /= 10;
		}
		
		return digitcounter;
	}
	
	// Method to derive prefix
	public static long getPrefix (long number, int k) {
		int numLoopIter = getSize(number) - k;
		
		for (int i = 1; i <= numLoopIter; ++i) {
			number /= 10;
		}
		
		return number;
	}
	
	public static boolean isValid (long number) {
		// Test if correct number of digits
		
		int numDigits = getSize(number);
		boolean correctnumDigits = (numDigits >= 13) && (numDigits <= 16);
		
		// Check for correct prefix
		int firstDigit = (int)getPrefix(number, 1);
		int firstTwoDigits = (int)getPrefix(number, 2);
		
		boolean correctPrefix = (firstDigit == 4) || (firstDigit == 5) ||
								(firstDigit == 6) || (firstTwoDigits == 37);
								
		boolean div10_test = ((sumOfDoubleEvenPlace(number) + 
							   getSumOfOddPlace(number)) % 10) == 0;
							   
		boolean valid = correctnumDigits && correctPrefix && div10_test;
		return valid;
	}
		
	// Define type of card based on prefix							
	public static String getCardType (long cardNumber) {
		String cardType = "";
		
		int firstDigit = (int)getPrefix(cardNumber, 1);
		int firstTwoDigits = (int)getPrefix(cardNumber, 2);
		
		switch (firstDigit) {
			case 4: cardType = "Visa";
					break;
			case 5: cardType = "Master";
					break;
			case 6: cardType = "Discover";
					break;
		}
		switch (firstTwoDigits) {
			case 37: cardType = "American Express";
					 break;
		}
		return cardType;
	}
					
	public static void main(String[] args) {
		long cardNumber = 0;

	// Take Input values
    Scanner input = new Scanner(System.in);
   
		do { // Do as many times until user enters 0
			System.out.print("Enter credit card number: ");
			cardNumber = input.nextLong();
	
			if (isValid(cardNumber)) {
				String CardType = getCardType(cardNumber);
				System.out.println("That is a valid " + CardType + 
								   " card number.");
			}
		
			else {
				System.out.println("That is not a valid card number");
			}
		
		} while (cardNumber != 0);
	
	}
}
