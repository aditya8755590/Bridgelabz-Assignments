package aditya.com;
import java.util.ArrayList;
public class Library {
	  static private ArrayList<Book> books = new ArrayList<>();
	  // add the boook in this array 
	  static public void addBook(Book newBook) {
		  // if the array list is non empty 
	        for (Book b : books) {
	            if (b.getIsbn().equals(newBook.getIsbn())) {
	                System.out.println("Book is already exists");
	            }
	        }
	        // if  book is not present 
	        books.add(newBook);
	        System.out.println("Book added");
	        
	    }
	  // find book in the list 
	  static public void searchByTitle(String keyword) {
		  boolean flag=false;
	        for (Book b:books) {
	            if (b.getTitle().contains(keyword)) {
	                System.out.println("yes book is present is you want to borrow ");
	                 flag = true;
	            }
	        }
	        if (!flag) {
	        	System.out.println("No books found");
	        	}
	    }
	  
	  static public void borrowBook(String isbn) {
	        for (Book b : books) {
	            if (b.getIsbn().equals(isbn)) {
	            	// borrow function in the book to check that the  available and change its availability or not 
	                if (b.borrow()) {
	                    System.out.println("You borrowed book " + b.getTitle());
	                } else {
	                    System.out.println("sorry not ablaible check fopr another ");
	                }
	               return ;
	            }
	        }
	        System.out.println("not found any book");
	    }
	  

	  

}
