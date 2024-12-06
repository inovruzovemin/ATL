package PACKAGE_NAME.DataStructures;
//        books.add(new Book("Crime and Punishment", "Dostoyevski"));
//        books.add(new Book("War and Peace", "Tolstoy"));
//        books.add(new Book);
public class BookMain {
    public static void main(String[] args) {
        System.out.println(" ");
        Library library = new Library();
        Book book1 = new Book("Crime and Punishment", "Dostoyevski");
        Book book2 = new Book("War and Peace", "Tolstoy");
        Book book3 = new Book("Martin Eden", "Jack London");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.showAvailableBooks();

        try {
            library.rentBook("War and Peace");
            library.rentBook("War and Peace");
        }
        catch (BookIsAlreadyRented e) {
            System.out.println(e.getMessage());
        }

        try {
            library.returnBook("Crime and Punishment");
        }
        catch (BookNotFound e) {
            System.out.println(e.getMessage());
        }

        library.showAvailableBooks();


    }
}
