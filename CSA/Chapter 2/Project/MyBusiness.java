import java.util.Scanner;

public class MyBusiness {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

// Using superclass and user input to construct clothing
    System.out.println("Create your own clothing");
    
    System.out.print("Male or Female: ");
    String gender = input.nextLine();
    
    System.out.print("Size: ");
    String size = input.nextLine();

    System.out.print("Price: $");
    Double price = input.nextDouble();
    
    Clothes newClothing = new Clothes(size, gender, price);
	newClothing.printInfo();
	
// Using subclass and user input to construct SportsJersey
    System.out.println("Create your own sports jersey");
		
  
    System.out.print("Color: ");
    String color = input.next();  

    System.out.print("Team: ");
    String team = input.next();

	
    SportsJersey newJersey = new SportsJersey(size, gender, price, team, color);
	// Using the setter method here
	newJersey.setPrice(110.99);
	
	System.out.println("That color you entered unavailable");
	System.out.print("Enter a different color: ");
	color = input.next();
	
	newJersey.setColor(color);
	newJersey.printInfo();
	
	
	Suit newSuit = new Suit();
	newSuit.setPrice(price * 2);
	newSuit.printInfo();
  }
}
