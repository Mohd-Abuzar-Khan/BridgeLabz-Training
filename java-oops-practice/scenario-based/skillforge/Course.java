package skillforge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Course implements ICertifiable {

    protected String title;
    protected Instructor instructor;
    protected List<String> modules;

    private double rating; // encapsulated
    private List<String> reviews = new ArrayList<>();

    // Default modules constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2; // protected logic
    }

    public double getRating() {
        return rating;
    }

    // Read-only access
    public List<String> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    protected void addReview(String review) {
        reviews.add(review);
    }

    public String getTitle() {
        return title;
    }
}
