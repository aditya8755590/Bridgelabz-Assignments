package OOPS;
//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
public class Book {
	 String title;
	 String author;
	 int  price;
	public Book() {
		this.title = "";
		this.author = "";
		this.price = 0;
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}


}
