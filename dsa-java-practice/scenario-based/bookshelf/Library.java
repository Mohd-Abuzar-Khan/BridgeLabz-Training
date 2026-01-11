package bookshelf;

public class Library {

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        // Fiction
        Book b1 = new Book("Fiction", "Harry Potter", "J.K. Rowling");
        Book b2 = new Book("Fiction", "Lord of the Rings", "J.R.R. Tolkien");
        Book b3 = new Book("Fiction", "The Alchemist", "Paulo Coelho");

        // Science
        Book b4 = new Book("Science", "A Brief History of Time", "Stephen Hawking");
        Book b5 = new Book("Science", "Cosmos", "Carl Sagan");

        // Philosophy
        Book b6 = new Book("Philosophy", "Meditations", "Marcus Aurelius");

        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);
        shelf.addBook(b4);
        shelf.addBook(b5);
        shelf.addBook(b6);

        print("LIBRARY COLLECTION");
        shelf.displayLibrary();

        shelf.borrowBook(b1);
        print(" AFTER BORROWING");
        shelf.displayLibrary();

        shelf.returnBook(b1);
        print(" AFTER RETURNING");
        shelf.displayLibrary();
    }

    private static void print(String title) {
        System.out.println("\n══════════════════════════════════════════════");
        System.out.println("   " + title);
        System.out.println("══════════════════════════════════════════════");
    }
}
