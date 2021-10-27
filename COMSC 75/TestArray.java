/* Karan Shah
 * LockerPuzzle
 * Solve Locker Puzzle
 */

import java.util.ArrayList;
public class TestArrayList {
	
	// Create boolean type
	public static boolean[] lockerlist = new boolean[100];
	
	// Method for changing locker from open to close and close to open
	public static void changelocker(int from_index, int increment) {
		for (int i = from_index; i < 100; i += increment) {
			// Change the boolean type
			if (lockerlist[i] == true) {
				lockerlist[i] = false;
			}
			else {
				lockerlist[i] = true;
			}
		}
	}
	
	public static void main(String[] args) {    
		
		// Create 100 false boolean types
		for (int i = 0; i < 100; i++ ) {
			lockerlist[i] = false ;
		}
		
		// Call the method
		for (int student = 0; student < 100; student++ ) {
			changelocker(student, student + 1);
		}
		
		// Print every boolean type
		for (int i = 0; i < 100; i++ ) {
			System.out.print(lockerlist[i] + " ");
		}
   }
  }
