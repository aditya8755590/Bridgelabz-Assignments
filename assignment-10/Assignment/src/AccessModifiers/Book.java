package AccessModifiers;
// Design a Book class with:
// ISBN (public).
// title (protected).
// author (private).
// Write methods to:
// Set and get the author name.
// Create a subclass EBook to access ISBN and title and demonstrate access modifiers.

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        setAuthor(author);
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }
}

// Subclass EBook
class EBook extends Book {
    private int fileSize;

    public EBook(String ISBN, String title, String author, int fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }
}
