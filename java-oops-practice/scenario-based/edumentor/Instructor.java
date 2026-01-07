package edumentor;

public class Instructor extends User {

    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void createQuiz() {
        System.out.println("Instructor " + name + " created a quiz.");
    }
}
