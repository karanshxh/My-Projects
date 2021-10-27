/* Karan Shah
 * MergeTest
 * Ask for two lists
 * Merge them from least to greatest
 */

import java.util.Scanner;
import java.util.ArrayList;


public class MergeTest {

   public static Scanner input = new Scanner(System.in);
   public static int[] arr1 = new int[100] ;

   //Scanner scan = new Scanner(System.in);
   // Method for changing locker from open to close and close to open
   public static void inputint(int listlength) {
      for (int i = 0; i < listlength; i++) {
         arr1[i] = input.nextInt();
        }
    }

   public static void main(String[] args) {
      System.out.println("Enter size of list.");
      int inputsize1 = input.nextInt();
      System.out.println("Enter items in list.");
      inputint(inputsize1);
    }
  }
