/* Karan Shah
 * PhoneWord
 * Translate a word to a phone number
 */
 
// Import Scanner for input
import java.util.Scanner;
//Import Math Function for square roots
import java.lang.Math;

public class Phone {
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
	char ch;
	while (i < 7) {
		ch = phoneword.charAt(i);
		ch = Character.toLowerCase(ch);
		switch (ch) {
			case 'a': case 'b': case 'c':
				System.out.print('2');
				break;
			case 'd': case 'e': case 'f':
				System.out.print('3');
				break;
			case 'g': case 'h': case 'i':
				System.out.print('4');
				break;
			case 'j': case 'k': case 'l':
				System.out.print('5');
				break;
			case 'm': case 'n': case 'o':
				System.out.print('6');
				break;
			case 'p': case 'q': case 'r': case 's':
				System.out.print('7');
				break;
			case 't': case 'u': case 'v':
				System.out.print('8');
				break;
			case 'w': case 'x': case 'y': case 'z':
				System.out.print('9');
				break;
			}
		i ++;
	}	
	System.out.println();
  }
}
