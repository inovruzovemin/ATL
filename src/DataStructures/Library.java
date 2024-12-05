package PACKAGE_NAME.DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class Library {

    ArrayList<Book> books;
    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public Library() {
    this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + "added to the library");
    }

    public void rentBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                book.rent();
                return;
            }
        }

    }
    public void returnBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                book.returnBook();
                return;
            }
        }
    }
    public void showAvailableBooks() {
        System.out.println("\nAvailable books: ");
        for (Book book : books) {
            if(book.isAvailable()){
                System.out.println(book);

            }
        }
    }
}
