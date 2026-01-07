package edumentor;

public class ShortTimeCourse extends Course {

    public ShortTimeCourse(String courseId, String title, int duration) {
        super(courseId, title, duration);
    }

    @Override
    public void generateCertificate(Learner learner) {
        System.out.println("Certificate: Short-Term Course Completion");
        System.out.println("Learner: " + learner.getName());
        System.out.println("Course: " + title);
    }
}

