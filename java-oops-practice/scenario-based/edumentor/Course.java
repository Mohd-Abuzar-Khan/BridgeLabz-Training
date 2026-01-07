package edumentor;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {

    protected String courseId;
    protected String title;
    protected int duration;

    // Internal student list must remain private
    private List<Learner> enrolledLearners = new ArrayList<>();
    private List<Quiz> quizzes = new ArrayList<>();

    public Course(String courseId, String title, int duration) {
        this.courseId = courseId;
        this.title = title;
        this.duration = duration;
    }

    public void enrollLearner(Learner learner) {
        if (!enrolledLearners.contains(learner)) {
            enrolledLearners.add(learner);
        }
    }

    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public void displayEnrolledLearners() {
        System.out.println("\nLearners enrolled in " + title + ":");
        for (Learner learner : enrolledLearners) {
            System.out.println("- " + learner.getName());
        }
    }

    public abstract void generateCertificate(Learner learner);
}
