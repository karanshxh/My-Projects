/* Karan Shah
 * PhoneWord
 * Translate a word to a phone number
 */
 
// Import Scanner for input
import java.util.Scanner;
//Import Math Function for square roots
import java.lang.Math;

public class PhoneWord {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
// Input prompt
    System.out.print("Enter a phone word: ");

    String phoneword = input.nextLine();
	
	if (phoneword.length() < 7) {
		System.out.println("Your phone word is not " + 
						"long enough for a phone number.");
	System.exit(0);
	}
	System.out.print("The number is: ");
	int i = 0;
	char c1;
	int cnt = 0;
	while (i < phoneword.length() && cnt < 7 ) {
		c1 = phoneword.charAt(i);
		c1 = Character.toLowerCase(c1);
		if (c1 == 'a' || c1 == 'b' ||
			c1 == 'c' ) {
				System.out.print("2");
				cnt ++;
		} 
		else if (c1 == 'D' || c1 == 'e' ||
				c1 ==  'f' ) {  
				System.out.print("3");
				cnt ++;
				}
		else if (c1 == 'g' || c1 == 'h' ||
				c1 ==  'i' ) {  
				System.out.print("4");
				cnt ++;
				}
		else if (c1 == 'j' || c1 == 'k' ||
				c1 ==  'l' ) {  
				System.out.print("5");
				cnt ++;
				}
		else if (c1 == 'm' || c1 == 'n' ||
				c1 ==  'o' ) {  
				System.out.print("6");
				cnt ++;
				}
		else if (c1 == 'p' || c1 == 'q' ||
				c1 ==  'r' || c1 ==  's') {  
				System.out.print("7");
				cnt ++;
				}
		else if (c1 == 't' || c1 == 'u' ||
				c1 ==  'v' ) {  
				System.out.print("8");
				cnt ++;
				}
		else if (c1 == 'w' || c1 == 'x' ||
				c1 ==  'y' || c1 ==  'z') {  
				System.out.print("9");
				cnt ++;
				}
		
		i ++;
	 }	
	 System.out.println();
  }
}
