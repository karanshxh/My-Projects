/**
 * Last name: Shah
 * First name: Karan
 * Period: 2
 * 
 * Write a Rectangle class that extends the Shape class. Do the following:
 * 1. Write the class header.
 * 2. Write a default constructor that initializes the name of the Rectangle object to "Rectangle".
 *    You will need to call the constructor of the parent Shape class.
 * 3. Write a void method printMessage() that prints the message "I am a 4 sided figure".
 *
 */
//Your code goes here

public class Rectangle extends Shape {
    public Rectangle(String name) {
    	super(name);
    }
    
   /**
   * Prints the number of sides
   * @param none
   * @return none
   */
   public void printMessage(){
      System.out.println("  I am a 4 sided figure");
   }
}
