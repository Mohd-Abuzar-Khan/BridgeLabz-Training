package bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookShelf {

    // Maps genres to their respective books and tracks available book names
    private Map<String, List<Book>> genreBookMap;
    private Set<String> availableBookNames;

    // Initializes all required data structures
    public BookShelf() {
        genreBookMap = new HashMap<>();
        availableBookNames = new HashSet<>();
    }

    // Adds a new book to the shelf after validating uniqueness
    public void addBook(Book newBook) {

        if (isBookAlreadyPresent(newBook.getName())) {
            System.out.println("Book already exists: " + newBook.getName());
            return;
        }

        initializeGenreIfMissing(newBook.getGenre());
        genreBookMap.get(newBook.getGenre()).add(newBook);
        availableBookNames.add(newBook.getName());

        System.out.println("Book added: " + newBook);
    }

    // Borrows a book by validating availability and removing it from the shelf
    public void borrowBook(Book requestedBook) {

        if (!isBookBorrowable(requestedBook)) {
            System.out.println("Book not available: " + requestedBook.getName());
            return;
        }

        genreBookMap.get(requestedBook.getGenre()).remove(requestedBook);
        availableBookNames.remove(requestedBook.getName());

        System.out.println("Book borrowed: " + requestedBook);
    }

    // Returns a previously borrowed book back to the shelf
    public void returnBook(Book returnedBook) {

        initializeGenreIfMissing(returnedBook.getGenre());
        genreBookMap.get(returnedBook.getGenre()).add(returnedBook);
        availableBookNames.add(returnedBook.getName());

        System.out.println("Book returned: " + returnedBook);
    }

    // Displays all books grouped under their respective genres
    public void displayLibrary() {

        for (Map.Entry<String, List<Book>> entry : genreBookMap.entrySet()) {
            System.out.println("\nGenre: " + entry.getKey());
            for (Book book : entry.getValue()) {
                System.out.println(" - " + book);
            }
        }
    }

    // Checks whether a book name already exists in the shelf
    private boolean isBookAlreadyPresent(String bookName) {
        return availableBookNames.contains(bookName);
    }

    // Initializes a genre list if it does not already exist
    private void initializeGenreIfMissing(String genre) {
        genreBookMap.putIfAbsent(genre, new LinkedList<>());
    }

    // Validates whether a book exists and is eligible to be borrowed
    private boolean isBookBorrowable(Book book) {
        return availableBookNames.contains(book.getName())
                && genreBookMap.containsKey(book.getGenre())
                && genreBookMap.get(book.getGenre()).contains(book);
    }
}
