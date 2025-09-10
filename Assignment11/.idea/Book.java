public class Book {
    //    Create a Book class to manage library books with the following features:
//    Static:
//            ○       A static variable libraryName shared across all books.
//            ○       A static method displayLibraryName() to print the library name.
//    This:
//            ○       Use this to initialize title, author, and isbn in the constructor.
//            Final:
//            ○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
//            Instanceof:
//            ○       Verify if an object is an instance of the Book class before displaying its details.

    static String libraryName="";
    final int isbn;
    Book(String libraryName, int isbn){
        this.libraryName=libraryName;
        this.isbn = isbn;
    }
    static void displayLibrary(){
        System.out.println("Library Name: "+libraryName);
    }
    void displayDetails(){
        if(this instanceof Book){
            System.out.println("ISBN: "+isbn);
        }
        else{
            System.out.println("Not a valid Book");
        }
    }
}
