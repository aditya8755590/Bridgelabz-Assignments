public class Product {
//     Create a Product class to manage shopping cart items with the following features:
// Static:
// ○       A static variable discount shared by all products.
// ○       A static method updateDiscount() to modify the discount percentage.
// This:
// ○       Use this to initialize productName, price, and quantity in the constructor.
// Final:
// ○       Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
// Instanceof:
// ○       Validate whether an object is an instance of the Product class before processing its details.

    static int discountPercentage=10;
    private final int productID;
    String productName="";
    int price=0;
    int quantity=0;
    private static int totalProducts=0; 
    Product(int productID,String productName,int price,int quantity){
        this.productID=productID;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        totalProducts++;
    }

    public static void updateDiscount(int newDiscount) {
        discountPercentage = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println(productID);
            System.out.println(productName);
            System.out.println(price);
            System.out.println(quantity);
            System.out.println(discountPercentage + "%");
        } else {
            System.out.println("Not a valid Product");
        }
    }
    public int getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}