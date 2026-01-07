package edumentor;

public class Learner extends User implements ICertifiable {

    private Course enrolledCourse;

    public Learner(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void enrollInCourse(Course course) {
        this.enrolledCourse = course;
        course.enrollLearner(this);
    }

    @Override
    public void generateCertificate() {
        if (enrolledCourse != null) {
            enrolledCourse.generateCertificate(this);
        } else {
            System.out.println("Learner not enrolled in any course.");
        }
    }
}
