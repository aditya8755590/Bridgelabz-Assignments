package aditya.com;

public class Main4 {
	public static void main(String[] args) {
		
		  Item i1 = new Item(101, "Pen", 50, 10);
	      Item i2 = new Item(102, "Pencil", 100, 5);
	      Item i3 = new Item(103, "Notebook", 30, 50);
	      Inventory.displayAll();
	      Inventory.searchByName("pen");
	      Inventory.searchByName("Aditya");
	      
		
	}

}
