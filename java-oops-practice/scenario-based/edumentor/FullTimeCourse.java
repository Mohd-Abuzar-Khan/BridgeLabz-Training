package edumentor;

public class FullTimeCourse extends Course {

    private int credits;

    public FullTimeCourse(String courseId, String title, int duration, int credits) {
        super(courseId, title, duration);
        this.credits = credits;
    }

    @Override
    public void generateCertificate(Learner learner) {
        System.out.println("Certificate: Full-Time Course Completion");
        System.out.println("Learner: " + learner.getName());
        System.out.println("Course: " + title);
        System.out.println("Credits Earned: " + credits);
        System.out.println("Duration: " + duration + " days");
    }
}
