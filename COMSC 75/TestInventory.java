/* Karan Shah
 * TestInventory
 * InventoryItem Class
 * Get/Set, Constructors, Display
 * Main
 * Input different item objects
 * Compare two items
 */

public class TestInventory {
  
  public static void main(String[] args) {
// Initialize 4 objects
  	InventoryItem empty = new InventoryItem();
  	InventoryItem stapler = new InventoryItem("Stapler, Red", +
      91745, 7.89);
  	InventoryItem pencil = new InventoryItem("Pencil, #2", +
      73105, 0.35, 210);
  	InventoryItem notebook = new InventoryItem("Notebook, Spiral", +
      68332, 2.57, 38);

//Print Number of items
  	System.out.println("Number of inventory items: " + 
      InventoryItem.nItems);

// Call display method for each object
  	empty.display();
    System.out.printf("Total value: %.2f\n", empty.getTotalValue());
  	stapler.display();
    System.out.printf("Total value: %.2f\n", stapler.getTotalValue());
  	pencil.display();
    System.out.printf("Total value: %.2f\n", pencil.getTotalValue());
  	notebook.display();
    System.out.printf("Total value: %.2f\n", notebook.getTotalValue());

// Compare
  	int compareValue = InventoryItem.compare(pencil, notebook);
  	if (compareValue == -1) {
  		System.out.printf("\n%s has less value than %s \n", 
        pencil.getItemName(), notebook.getItemName());
  	}

  	else if (compareValue == 0) {
  		System.out.printf("\n%s has equal value to %s \n",
        pencil.getItemName(), notebook.getItemName());
  	}

  	else if (compareValue == 1) {
  		System.out.printf("\n%s has greater value than %s \n",
        pencil.getItemName(), notebook.getItemName());
  	}
  }
}

// Inventory Item Class with Methods
class InventoryItem {
	private String itemName;
	private int sku;
	private double price;
	private int quantity;
	static int nItems = 0;

/* Increase count of items in inventory
	{
		nItems ++;
	}
*/
// 0 arg constructor
  public InventoryItem() {
  	this("TBD", 0, 0.0, 0);
    System.out.println("in 0args - before" + nItems);
    System.out.println("in 0args - after" + nItems);
  }

// 3 arg constructor
  public InventoryItem(String newItemName, int newSku,
      double newPrice) {
    this.itemName = newItemName;
    this.sku = Math.abs(newSku);
    this.price = Math.abs(newPrice);
    nItems ++;  
  }

// 4 arg constructor
  public InventoryItem(String newItemName, int newSku,
      double newPrice, int newQuantity) {
    this.itemName = newItemName;
    this.sku = Math.abs(newSku);
    this.price = Math.abs(newPrice);
    this.quantity = Math.abs(newQuantity);
    nItems ++;
  }

// Get/Set "itemName"
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

// Get/Set "sku"
  public int getSku() {
    return sku;
  }
  public void setSku(int sky) {
    this.sku = sku;
  }

// Get/Set "price"
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }

// Get/Set "quantity"
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

// Create totalValue
  public double getTotalValue() {
    double totalValue = price * quantity;
    return totalValue;    
  }

// Compare
  public static int compare(InventoryItem item1, InventoryItem item2) {
	  int returnValue;
    if (item1.getTotalValue() < item2.getTotalValue()) {
	    returnValue = -1;
	  }
	  else if (item1.getTotalValue() == item2.getTotalValue()) {
	    returnValue = 0;
	  }
	  else {
	    returnValue = 1;
	  }
    return returnValue;
  }  

// Display method
  public void display() {
	System.out.printf("\n%s [SKU %d]: %d at $%.2f each\n", 
    this.getItemName(), this.getSku(),
    this.getQuantity(), this.getPrice());
	}
}