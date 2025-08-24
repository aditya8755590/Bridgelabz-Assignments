package aditya.com;

public class Book {
	private String isbn;
    private String title;
    private String author;
    private boolean available;
    // create a constructor 
	public Book(String isbn, String title, String author, boolean available) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.available = available;
	}
	
	
	// we use to get the methods because instance methods are private 
	public String getIsbn() {
		return this.isbn;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public boolean isAvailable() {
		return this.available;
	}
	
	public boolean borrow(){
		  if (this.available) {
			  // false the avlaiblity
	            this.available = false;
	            return true;
	        }
	        return false;
		
	}
	// return a book 
	 public void returnBook() {
	        available = true;
	    }

}

