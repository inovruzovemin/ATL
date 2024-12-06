package PACKAGE_NAME.DataStructures;

public class Book {
    String title;
    String author;
    String genre;
    private boolean available;

    public Book(String name, String author) {
        this.title = name;
        this.author = author;
        this.available = true;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " " + author;
    }

    public void rent() {
        if (available) {
            available = false;
            System.out.println("\n" + title + " rented successfully.");
        } throw new BookIsAlreadyRented("Book is already rented");
    }
public boolean isAvailable() {
        return available;
}

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("\n" +title + " returned successfully.");
        } throw new BookNotFound("Book is not found");



    }
}
