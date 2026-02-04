package com.casestudy.librarymanagementsystem;

public class LibraryManagementSystem {
    
    public static void main(String[] args) {
        System.out.println("=" .repeat(70));
        System.out.println("SMART UNIVERSITY LIBRARY MANAGEMENT SYSTEM");
        System.out.println("Demonstrating GoF Design Patterns");
        System.out.println("=".repeat(70));
        
        System.out.println("\nSINGLETON PATTERN - Library Catalog");
        System.out.println("-".repeat(70));
        
        LibraryCatalog catalog = LibraryCatalog.getInstance();
        LibraryCatalog catalog2 = LibraryCatalog.getInstance();
        System.out.println("Same instance? " + (catalog == catalog2));
        
        System.out.println("\nFACTORY PATTERN - User Creation");
        System.out.println("-".repeat(70));
        
        User alice = UserFactory.createUser("student", "Alice");
        User bob = UserFactory.createUser("faculty", "Dr. Bob");
        User carol = UserFactory.createUser("librarian", "Carol");
        User david = UserFactory.createUser("student", "David");
        
        alice.showRole();
        bob.showRole();
        carol.showRole();
        david.showRole();
        
        System.out.println("\nOBSERVER PATTERN - Notification System");
        System.out.println("-".repeat(70));
        
        catalog.addObserver(alice);
        catalog.addObserver(bob);
        catalog.addObserver(carol);
        
        System.out.println("\nBUILDER PATTERN - Book Creation");
        System.out.println("-".repeat(70));
        
        Book book1 = new Book.BookBuilder("Design Patterns")
                .author("Gang of Four")
                .edition("2nd Edition")
                .genre("Software Engineering")
                .build();
        
        Book book2 = new Book.BookBuilder("Clean Code")
                .author("Robert C. Martin")
                .genre("Software Engineering")
                .build();
        
        Book book3 = new Book.BookBuilder("Introduction to Algorithms")
                .author("Cormen, Leiserson, Rivest, Stein")
                .edition("4th Edition")
                .build();
        
        System.out.println("\nPATTERN INTEGRATION - Adding Books & Notifications");
        System.out.println("=".repeat(70));
        
        catalog.addBook(book1);
        sleep(500);
        
        catalog.addBook(book2);
        
        System.out.println("\nDavid joins the notification list");
        catalog.addObserver(david);
        sleep(500);
        
        catalog.addBook(book3);
        
        catalog.displayStatistics();
        catalog.displayAllBooks();
        
        System.out.println("\nUnsubscribing Alice from notifications");
        System.out.println("-".repeat(70));
        catalog.removeObserver(alice);
        
        Book book4 = new Book.BookBuilder("Effective Java")
                .author("Joshua Bloch")
                .edition("3rd Edition")
                .genre("Programming")
                .build();
        
        catalog.addBook(book4);
        System.out.println("   (Alice doesn't receive this notification)");
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("DEMONSTRATION COMPLETE");
        System.out.println("=".repeat(70));
        System.out.println("Patterns Demonstrated:");
        System.out.println("  Singleton  - One catalog instance throughout the application");
        System.out.println("  Factory    - Dynamic user creation (Student, Faculty, Librarian)");
        System.out.println("  Observer   - Automatic notifications to subscribed users");
        System.out.println("  Builder    - Flexible book construction with optional attributes");
        System.out.println("=".repeat(70));
    }
    
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}