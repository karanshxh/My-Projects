// To Do: Write the class header for your subclass.
// Rename the file to match the name of your subclass.
public class Suit extends Clothes{

// To Do: Declare the instance variables for your subclass.
	private String brand;
	private boolean hasTie;

// To Do: Write your first constructor.
// Describe your constructor here.

 	// Constructor for attributes size (String), gender (String), brand (String), hasTie (Boolean)
	public Suit(String size, String gender, Double price, String brand, boolean hasTie){
    super(size, gender, price);
    this.brand = brand;
    this.hasTie = hasTie;
  }

// To Do: Write your second constructor.
// Describe your constructor here.

  // Constructor for attributes size (String), gender (String), automatically sets brand to "Target", hasTie (Boolean)
	public Suit(){
    super();
    brand = "Prada";
    hasTie = true;
  }
  
  // Constructor for attributes size (String), gender (String), automatically sets brand to "Target", hasTie (Boolean)
	public Suit(String size, String gender, Double price){
    super(size, gender, price);
    brand = "Gucci";
    hasTie = false;
  }

// To Do: Write your accessor methods.
// Describe each accessor method in a comment.

  /** getBrand accesses the instance variable brand
  * @param - none
  * @return type - String
  */
  public String getBrand(){
    return brand;
  }

  /** getPrice accesses the instance variable hasTie
  * @param - none
  * @return type - boolean
  */
  public boolean getHasTie(){
    return hasTie;
  }

// To Do: Write your mutator methods.
// Describe each mutator method in a comment.

	/** setBrand mutates the instance variable brand
  * @Param - new brand String
  * @Return - none    
	*/
  public void setBrand(String newBrand){
    brand = newBrand;
  }

  /** setPrice mutates the instance variable hasTie
  * @Param - new hasTie boolean
  * @Return - none    
	*/
  public void setHasTie(Boolean newHasTie){
    hasTie = newHasTie;
  }

// To Do: Write a toString() method.

	/** toString returns the super and sub class instance variables
  * @param - none
  * @return - String
	*/
  public String toString(){
    return ("Suit details: \n" + super.toString() + "\nBrand: \"" + brand + "\"\nHas a tie: "+ hasTie);
  }

  /** printInfo prints the toString method
  * @param - none
  * @return - none
  */
  public void printInfo(){
    System.out.println(toString());
  }
}
