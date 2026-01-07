package edumentor;

import java.util.ArrayList;

public class EduMentorApp {

    public static void main(String[] args) {

        // Create quiz object
        Quiz quiz = new Quiz();

        // Add questions to quiz
        quiz.addQuestion(
                "What is OOP?\n" +
                "A. Object Oriented Programming\n" +
                "B. Old Order Process\n" +
                "C. Open Output Program",
                'A'
        );

        quiz.addQuestion(
                "What is Encapsulation?\n" +
                "A. Data Hiding\n" +
                "B. Code Duplication\n" +
                "C. Multiple Inheritance",
                'A'
        );

        // Display quiz questions
        quiz.displayQuestions();

        // Create student answer sheet
        ArrayList<Character> studentAnswers = new ArrayList<>();
        studentAnswers.add('A');
        studentAnswers.add('B');

        // Evaluate quiz
        quiz.evaluate(studentAnswers);

        // Display result
        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.calculatePercentage() + "%");
    }
}
