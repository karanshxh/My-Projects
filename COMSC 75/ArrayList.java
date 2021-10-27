/* Karan Shah
 * MergeTest
 * Ask for two lists
 * Merge them from least to greatest
 */

import java.util.Scanner;
import java.util.ArrayList;


public class MergeTest {

	public static Scanner input = new Scanner(System.in);
	public static int[] arr1 = new int[100];
	public static int[] arr2 = new int[100];
	public static int[] array = new int[100];
	//Scanner scan = new Scanner(System.in);
	// Method for changing locker from open to close and close to open
	public static arraylist inputintegers(int listlength) {
		for (int i = 0; i < listlength; i++) {
		array[i] = input.nextInt();
		}
		return arraylist;
	}

	public static void main(String[] args) {
		
		// List 1
		System.out.print("Enter size of list: ");
		int inputsize1 = input.nextInt();
		System.out.print("Enter items in list: ");
		inputintegers(inputsize1);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
		// List 2
		System.out.print("Enter size of list: ");
		int inputsize2 = input.nextInt();
		System.out.println("Enter items in list.");
		inputintegers(inputsize2);
		
		}
	}
