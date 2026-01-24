package sorting.smartlibrary;

public class SmartLibrary {

	static int bookCount = 0;
	static Book[] bookSelf = new Book[bookCount];
	
	static void addBook(String title, String author, String genre) {
		
		Book book = new Book(title, author, genre);
				
		Book[] temp = new Book[bookCount + 1];
		for(int i = 0; i < bookCount; i++ ) {
			temp[i] = bookSelf[i];
		}
		
		bookSelf = temp;
		
		int j = bookCount - 1;
		
		while(j >= 0 && bookSelf[j].title.compareTo(book.title) > 0) {
			bookSelf[j+1] = bookSelf[j];
			j--;
		}
		
		bookSelf[j + 1] = book;
		bookCount++;
		
		System.out.println(bookCount + " Book with title " + title + " added Successfully ");
		
	}
	
	static void displayBook() {
		System.out.println("\n\n------------------------------------");
		System.out.println("Displaying user borrowed books");
		System.out.println("------------------------------------");
		for (int i = 0; i < bookSelf.length; i++) {

			System.out.println("Title -> " + bookSelf[i].title);

		}
	}

	public static void main(String[] args) {

		// Adding books to library book self
		addBook("The Kite Runner", "Khaled Hosseini", "Fiction");
		addBook("The Book Thief", "Markus Zusak", "Fiction");
		addBook("Fahrenheit 451", "Ray Bradbury", "Dystopian");
		addBook("The Handmaid's Tale", "Margaret Atwood", "Dystopian");
		addBook("Mistborn: The Final Empire", "Brandon Sanderson", "Fantasy");
		addBook("Percy Jackson and the Lightning Thief", "Rick Riordan", "Fantasy");
		addBook("The Name of the Wind", "Patrick Rothfuss", "Fantasy");
		addBook("Cosmos", "Carl Sagan", "Science");
		addBook("The Elegant Universe", "Brian Greene", "Science");
		addBook("Sapiens", "Yuval Noah Harari", "Science");
		addBook("Design Patterns", "Erich Gamma", "Technology");
		addBook("You Don’t Know JS", "Kyle Simpson", "Technology");
		addBook("Zero to One", "Peter Thiel", "Business");

		
		// Displaying books before sorting
		displayBook();

	}

}
