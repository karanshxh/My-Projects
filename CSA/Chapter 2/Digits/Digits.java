/**
* Last name: Shah
* First name: Karan 
* Student ID: 12094459
* Period: 2
* 
* Unit 2 Lab 2 - Digits
* 
* Write a program that inputs a positive three digit integer. 
* and prints out the digits one per line.
* Sample run:
* Please enter a three digit number: 678
* The digits of the three digit number 678 are
* 6
* 7
* 8
* 
* Do the following:
* 
* 1. Create three instance variables to hold the three digits of the number
* 2. Write a private helper method called split that splits the given three digit number
*    to three separate digits. Initialize the three instance variables here.
* 3. Write a constructor that takes in a three digit number and calls the 
*    split method written above.
* 4. Write a toString method that returns the string to print the three digits of the number in
*    the following format:
*    The three digits of the number 678 are 
*    6
*    7
*    8
* 5. Include Javadoc style comments for each method.
*    
*/

public class Digits {
	private int firstDigit;
	private int secondDigit;
	private int thirdDigit;
	
	/** 
	 * split gets the first, second, and third digits of a 3 digit number and assigns them to instance variables
	 * @param num the 3 digit integer
	 */
	public void split(int num) {
		firstDigit = (num/100);
		num -= (firstDigit*100);
		
		secondDigit = (num/10);
		num -= (secondDigit*10);
		
		thirdDigit = num;
	}
	
	/**
	 * Calls split method with parameter as 3 digit number
	 * @param num the 3 digit integer
	 */
	public Digits(int num) {
		split(num);
	}
	
	/** 
	 * toString method to list out the 3 digits
	 * @param num the 3 digit integer
	 * @return string
	 */
	public String toString(int num) {
		return ("The three digits of the number " + num + " are\n" + firstDigit + "\n" + secondDigit + "\n" + thirdDigit);
	}
}
