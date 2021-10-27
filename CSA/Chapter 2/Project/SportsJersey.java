// To Do: Write the class header for your subclass.
// Rename the file to match the name of your subclass.
public class SportsJersey extends Clothes{

// To Do: Declare the instance variables for your subclass.
	private String team;
	private String color;

// To Do: Write your first constructor.
// Describe your constructor here.

  // Constructor for attributes size (String), gender (String), team (String), color (String)
	public SportsJersey(String size, String gender, Double price, String team, String color){
    super(size, gender, price);
    this.team = team;
    this.color = color;
  }

// To Do: Write your second constructor.
// Describe your constructor here.

  // Constructor for attributes size (String), gender (String), team (String), and automatically sets color to "white"
	public SportsJersey(String size, String gender, Double price, String team){
    super(size, gender, price);
    color = "white";
    this.team = team;
  }


// To Do: Write your accessor methods.
// Describe each accessor method in a comment.

  /** getTeam accesses the instance variable team
  * @param - none
  * @return type - String
  */
  public String getTeam(){
    return team;
  }

  /** getColor accesses the instance variable color
  * @Param - none
  * @Return type - String
  */
  public String getColor(){
    return color;
  }

// To Do: Write your mutator methods.
// Describe each mutator method in a comment.
 
  /** setLayers mutates the instance variable team
  * @param - new team String
  * @return - none    
	*/
  public void setTeam(String newTeam){
    team = newTeam;
  }

  /** setColor mutates the instance variable color
  * @param - new color String
  * @return - none    
  */
  public void setColor(String newColor){
    color = newColor;
  }

// To Do: Write a toString() method.

  /** toString returns the super and sub class instance variables
  * @param - none
  * @return - String
  */
  public String toString(){
    return ("Sports Jersey details: \n" + super.toString() + "\nTeam: \"" + team + "\"\nColor: \"" + color + "\"");
  }

  /** printInfo prints the toString method
  * @param - none
  * @return - none
  */
  public void printInfo(){
    System.out.println(toString());
  }
}
