package aditya.com;

public class Item {
	    int ItemCode;
	    String ItemName;
	    int Quantity;
	    double PricePerUnit;

	    public Item(int code, String name, int qty, double price) {
	        this.ItemCode = code;
	        this.ItemName = name;
	        this.Quantity = qty;
	        this.PricePerUnit = price;
	        Inventory.addItem(this); // auto add to inventory
	    }
	}
