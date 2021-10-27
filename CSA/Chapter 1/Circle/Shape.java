/**
 * Last name: Shah
 * First name: Karan
 * Period: 2
 * 
 * Write a Shape class. Do the following:
 * 1. Write a class header for the Shape class.
 * 2. Create a String attribute that holds the name of the Shape object. Use the keyword String to
 *    declare a variable of your choice.
 * 3. Write a parameterized constructor that initializes the name of the Shape object.
 * 4. Write a void method printName() that prints the name of the Shape object.
 *
 */
//Your code goes here
// Create shape class with String attribute
public class Shape {
   String enterName;

   public Shape(String name){
      enterName = name;
   }
   
   /**
   * Prints the number of sides and sides description
   * @param none
   * @return none
   */
   public void printName(){
      System.out.println("I am a " + enterName);
   }
}
