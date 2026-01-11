package bookshelf;

public class Book {

    private String name;
    private String genre;
    private String author;

    public Book(String genre, String name, String author) {
        this.genre = genre;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return name + " by " + author;
    }
}
