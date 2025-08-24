package aditya.com;

public class Main {
	
	public static void main() {
		Book ATOMIC_HABBIT = new Book("600","tiny changes markablee result ","JemsClear",true);
		Book geeta = new Book("600","how to live life ","ved vayas",true);
		Book Dsa = new Book("600","data structue and algo","Aditya ",true);
		Book python = new Book("600","python language ","Rossum",true);
	    Library.addBook(ATOMIC_HABBIT);
	    Library.addBook(geeta);
	    Library.addBook(Dsa);
	    Library.addBook(python);
	    Library.searchByTitle("tiny changes markablee result ");
		
	}

}
