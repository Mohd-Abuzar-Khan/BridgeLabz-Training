package edumentor;


import java.util.ArrayList;

public class Quiz {

    // Internal question bank must remain private
    private ArrayList<String> questions;

    // Correct answers must not be modified once added
    private final ArrayList<Character> correctAnswers;

    private int score;

    // Constructor initializes empty quiz
    public Quiz() {
        questions = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        score = 0;
    }

    // Method to add a question with its correct answer
    public void addQuestion(String question, char correctAnswer) {

        questions.add(question);
        correctAnswers.add(Character.toUpperCase(correctAnswer));
    }

    // Display all questions
    public void displayQuestions() {

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Q" + (i + 1) + ". " + questions.get(i));
            System.out.println();
        }
    }

    // Evaluate student answers
    public void evaluate(ArrayList<Character> studentAnswers) {

        if (studentAnswers.size() != correctAnswers.size()) {
            throw new IllegalArgumentException("Answer sheet size mismatch");
        }

        score = 0;

        for (int i = 0; i < correctAnswers.size(); i++) {
            if (
                Character.toUpperCase(studentAnswers.get(i)) ==
                correctAnswers.get(i)
            ) {
                score++;
            }
        }
    }

    // Calculate percentage
    public double calculatePercentage() {
        return ((double) score / questions.size()) * 100;
    }

    public int getScore() {
        return score;
    }
}
