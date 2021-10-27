// To Do: Write the class header for your superclass.
// Rename the file to match the name of your superclass.
public class Clothes{
  
  //initializing instance variables
  private String size;
  private String gender;
  private Double price;

  /** Constructor that reads two parameters for object constructor
	*@param sz, int describing the size of the clothing
	*@param isMale, Boolean, true = Male, false = female, gender category of clothing
	**/
  public Clothes(String size, String gender, Double price){
    this.size = size;
    this.gender = gender;
    this.price = price;
  }

  /**Constructor that reads only size
	*@param sz, int, size of clothing
	*default value for isMale is true
	**/
  public Clothes(){
    size = "M";
    gender = "Male";
   	price = 19.99;
  }

  /** getSize accesses the instance variable size
  * @param - none
  * @return type - String
  */
  public String getSize(){
    return size;
  }

  /** getGender accesses the instance variable gender
  * @param - none
  * @return type - String
  */
  public String getGender(){
    return gender;
  }

  /** getPrice accesses the instance variable price
  * @param - none
  * @return type - Double
  */
  public Double getPrice(){
    return price;
  }

  /** setSize mutates the instance variable size
  * @param - new size String
  * @return - none    
	*/
  public void setSize(String newSize){
    size = newSize;
  }

  /** setGender mutates the instance variable gender
  * @param - new gender String
  * @return - none    
	*/
  public void setGender(String newGender){
    gender = newGender;
  }

  /** setPrice mutates the instance variable price
  * @Param - new color Double
  * @Return - none    
	*/
	public void setPrice(Double newPrice){
    price = newPrice;
  }
  
  /** toString returns the instance variables
  * @param - none
  * @return - String
	*/
  public String toString(){
    return ("Gender: \"" + gender + "\"\nSize: \"" + size + "\""  + "\nPrice: $" + price);
  }

  /** printInfo prints the toString method
  * @param - none
  * @return - none
  */
  public void printInfo(){
    System.out.println(toString());
  }
}
