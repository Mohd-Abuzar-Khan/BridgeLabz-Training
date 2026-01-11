package skillforge;

import java.util.Arrays;

public class SkiilForge {

    public static void main(String[] args) {

        Instructor inst = new Instructor("Dr. Rao", "rao@skillforge.com");
        Student student = new Student("Abuzar", "abuzary@gmail.com");

        Course javaCourse = new AdvancedCourse(
                "Advanced Java",
                inst,
                Arrays.asList("JVM", "Multithreading", "Design Patterns")
        );

        inst.uploadCourse(javaCourse);

        student.updateProgress(3, 3);
        student.updateGrade(85, 100);

        javaCourse.generateCertificate(student);
    }
}
