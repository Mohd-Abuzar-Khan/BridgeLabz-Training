package sorting.smartshelf;

public class SmartShelf {
	// Initializing array to store object of books
	static Book[] bookShelf = new Book[13];
	static int bookCount = 0;

	// Method to add books
	static void addBook(String title, String author, String genre) {
		Book book = new Book(title, author, genre);

		if (bookCount == 0) {
			bookShelf[0] = book;
			bookCount++;
			return;
		} else {
			bookShelf[bookCount] = book;
			bookCount++;
		}

	}

	// Method to sort Book in a self by title
	static void sortBook() {

		for (int i = 1; i < bookShelf.length; ++i) {

			int j = i - 1;
			Book key = bookShelf[i];

			while (j >= 0 && ((bookShelf[j].title.compareTo(key.title)) > 0)) {
//	        	
				bookShelf[j + 1] = bookShelf[j];
				j--;
			}
			bookShelf[j + 1] = key;
		}

	}

	// Method to display books
	static void displayBook() {
		System.out.println("\n\nDisplaying books in self\n");
		for (int i = 0; i < bookShelf.length; i++) {

			System.out.println("Title -> " + bookShelf[i].title);

		}
	}

	public static void main(String[] args) {

		// Adding books to library book self
		addBook("The Alchemist", "Paulo Coelho", "Fiction");
		addBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
		addBook("1984", "George Orwell", "Dystopian");
		addBook("Brave New World", "Aldous Huxley", "Dystopian");
		addBook("The Hobbit", "J.R.R. Tolkien", "Fantasy");
		addBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
		addBook("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
		addBook("A Brief History of Time", "Stephen Hawking", "Science");
		addBook("The Selfish Gene", "Richard Dawkins", "Science");
		addBook("The Selfish Gene", "Richard Dawkins", "Science");
		addBook("Clean Code", "Robert C. Martin", "Technology");
		addBook("Introduction to Algorithms", "Thomas H. Cormen", "Technology");
		addBook("The Lean Startup", "Eric Ries", "Business");
		// Displaying books before sorting
		displayBook();

		// Calling method to sort books
		sortBook();

		// Displaying books after sorting
		displayBook();

	} 

}