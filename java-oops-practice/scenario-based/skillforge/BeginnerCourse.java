package skillforge;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.getProgress() >= 80) {
            System.out.println("🎉 Certificate of Completion");
            System.out.println("Awarded to: " + student.name);
            System.out.println("Course Level: Beginner");
        } else {
            System.out.println("Complete more modules to earn certificate.");
        }
    }
}
