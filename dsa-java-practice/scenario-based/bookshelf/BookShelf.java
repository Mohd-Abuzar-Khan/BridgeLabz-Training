package bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BookShelf {

    // Stores books grouped by genre
    private HashMap<String, LinkedList<Book>> books;

    // Tracks unique books present in the library
    private HashSet<String> bookInLibrary;

    // Constructor initializes data structures
    public BookShelf() {
        books = new HashMap<>();
        bookInLibrary = new HashSet<>();
    }

    // Adds a book to the shelf if it does not already exist
    public void addBook(Book book) {

        // Check for duplicate book
        if (bookInLibrary.contains(book.getName())) {
            System.out.println(" Already exists: " + book.getName());
            return;
        }

        // Create genre list if absent
        books.putIfAbsent(book.getGenre(), new LinkedList<>());

        // Add book to genre list
        books.get(book.getGenre()).add(book);

        // Track book in library set
        bookInLibrary.add(book.getName());

        // Confirmation message
        System.out.println("✅ Added: " + book);
    }

    // Borrows a book if available
    public void borrowBook(Book book) {

        // Validate book availability
        if (bookInLibrary.contains(book.getName())
                && books.containsKey(book.getGenre())
                && books.get(book.getGenre()).contains(book)) {

            // Remove book from shelf
            books.get(book.getGenre()).remove(book);

            // Remove from tracking set
            bookInLibrary.remove(book.getName());

            // Success message
            System.out.println(" Borrowed → " + book);

        } else {
            // Failure message
            System.out.println(" Book not available: " + book.getName());
        }
    }

    // Returns a borrowed book to the shelf
    public void returnBook(Book book) {

        // Create genre list if absent
        books.putIfAbsent(book.getGenre(), new LinkedList<>());

        // Add book back to shelf
        books.get(book.getGenre()).add(book);

        // Add back to tracking set
        bookInLibrary.add(book.getName());

        // Confirmation message
        System.out.println(" Returned → " + book);
    }

    // Displays all books grouped by genre
    public void displayLibrary() {

        // Iterate through genres
        for (String genre : books.keySet()) {

            // Print genre header
            System.out.println("\n🔹 Genre: " + genre);

            // Print all books under the genre
            for (Book book : books.get(genre)) {
                System.out.println("   • " + book);
            }
        }
    }
}
