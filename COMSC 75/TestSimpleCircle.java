public class TestSimpleCircle {  
	/** Main method */  
	public static void main(String[] args) {    
		InventoryItem empty = new InventoryItem();
		InventoryItem stapler = new InventoryItem("Stapler, Red", 91745, 
								7.89, 0);
		stapler.display();
		InventoryItem pencil = new InventoryItem("Pencil, #2", 73105, 
								0.35, 210);
		pencil.display();
	}
}
		
		// Define the circle class with two constructors 
public class InventoryItem {  
	 
	
	InventoryItem() {
		String itemName = "TBD";
	}
	InventoryItem(String newItemName, int newSku, 
				  double newPrice) {
		itemName = newItemName;
		sku = Math.abs(newSku);
		price = Math.abs(newPrice);
	}
	InventoryItem(String newItemName, int newSku, 
				  double newPrice, int newQuantity) {
		itemName = newItemName;
		sku = Math.abs(newSku);
		price = Math.abs(newPrice);
		quantity = Math.abs(newQuantity);
	}
	InventoryItem(String newItemName, int newSku, 
				  int newQuantity) {
		itemName = newItemName;
		sku = Math.abs(newSku);
		quantity = Math.abs(newQuantity);
	}
	
	double getTotalValue(double price, double quantity) {
		double total = price * quantity;
		return total;
	}
	
	void display() {
		System.out.println(itemName + " [SKU " + sku + "]: " + quantity
			+ " at $" + price + " each \n Total Value: $" 
			+ getTotalValue(price, quantity));
	}
}

