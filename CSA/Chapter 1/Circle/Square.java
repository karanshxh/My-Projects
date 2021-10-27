/**
 * Last name: Shah
 * First name: Karan
 * Period: 2
 * 
 * Write a Square class that extends the Rectangle class. Do the following:
 * 1. Write the class header.
 * 2. Write a default constructor that initializes the name of the Square object to "Rectangle".
 *    You will need to call the constructor of the parent Rectangle class.
 * 3. Write a void method printMessage() that prints the message 
 *    "I am a 4 sided figure
 *       I have equal sides"
 *    You must call the parent's printMessage() method using super.printMessage().
 *
 */
//Your code goes here

// Extend the Rectangle class to create Square class
public class Square extends Rectangle {
    public Square(String name) {
    	super("Rectangle");
    }

/**
* Prints the number of sides and sides description
* @param none
* @return none
*/
   public void printMessage(){
      System.out.println("  I am a 4 sided figure");
      System.out.println("    I have equal sides");
   }
}
