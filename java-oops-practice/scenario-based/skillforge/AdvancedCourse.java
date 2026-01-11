package skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, java.util.List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.getProgress() >= 90 && student.getGrade() >= 70) {
            System.out.println("🏆 Certificate of Excellence");
            System.out.println("Awarded to: " + student.name);
            System.out.println("Course Level: Advanced");
            System.out.println("Grade: " + student.getGrade() + "%");
        } else {
            System.out.println("Requirements not met for advanced certification.");
        }
    }
}
