package skillforge;

public class Student extends User {

    private double progress; // percentage
    private double grade;

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
        this.grade = 0;
    }

    public void updateProgress(double completedModules, double totalModules) {
        progress = (completedModules / totalModules) * 100; // operator usage
    }

    public void updateGrade(double score, double total) {
        grade = (score / total) * 100;
    }

    public double getProgress() {
        return progress;
    }

    public double getGrade() {
        return grade;
    }
}
