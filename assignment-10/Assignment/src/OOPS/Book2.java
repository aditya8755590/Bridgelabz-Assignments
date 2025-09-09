package OOPS;

// Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
public class Book2 {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isAvailable = true;
    }
}
