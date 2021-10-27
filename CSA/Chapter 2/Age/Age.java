

import java.util.Scanner;

/*
* Last name: Shah
* First name: Karan
* Student ID: 12094459
* Period: 2
* 
* Unit 2 Lab 1
* 
* In this programming challenge, you will calculate the user's age, 
* their pet's age, and their pet's age in dog years. In the code 
* below, prompt the user for the current year, the year they were 
* born, and the year their dog or cat was born. Save these values 
* in the variables. Then write formulas in assignment statements
* to calculate how old the user is, how old their dog or cat is, and how 
* old their dog/cat is in dog years which is 7 times a human year. Finally, 
* print it all out. 
*/


public class Age
{
   public static void main(String[] args)
   {
	   //Declare a final integer variable called AGE_FACTOR that is initialized to 7
	   final int AGE_FACTOR = 7;
	   
	   //Create and initialize a Scanner
	   Scanner input = new Scanner(System.in);
	   
	   // Prompt the user for the current year, birth year, and their dog's birth year
	   // and save the values input by the user into the corresponding variables
	   

	   System.out.print("Enter the current year: ");
	   int currentYear = input.nextInt();
	   
	   System.out.print("Enter your birth year: ");
	   int birthYear = input.nextInt();
	  
	   System.out.print("Enter your dog's birth year");
	   int dogBirthYear = input.nextInt();


	   // Write a formula to calculate your age
	   // from the currentYear and your birthYear variables
	   int age = currentYear - birthYear;

	   // Write a formula to calculate your dog's age
	   // from the currentYear and dogBirthYear variables
	   int dogAge = currentYear - dogBirthYear; 

	   // Calculate the age of your dog in dogYears (AGE_FACTOR times a human year)
	   int dogYearsAge = dogAge * AGE_FACTOR; 

	   // Print out your age, your dog's age, and your dog's age in dog years. Make sure you print out text too so that the user knows what is being printed out.
	   System.out.println("Your age is " + age);
	   System.out.println("Your dog's age is " + dogAge);
	   System.out.println("Your dog's age in dog years is " + dogYearsAge);

	   

   }
}
