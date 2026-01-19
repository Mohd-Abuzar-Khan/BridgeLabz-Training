package examproctor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ExamProctor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // HashMap stores ONLY correct answers (answer key)
        HashMap<Integer, Character> answerKey = new HashMap<>();

        Stack<Questions> history = new Stack<>();
        ArrayList<Questions> testQuestions = new ArrayList<>();

        int score = 0;
        int index = 0;

        // Questions automatically register answers
        testQuestions.add(new Questions(
                "What is the capital of France?\n a. Paris\n b. London\n c. Berlin\n d. Rome",
                1, 'a', answerKey));

        testQuestions.add(new Questions(
                "What is the capital of Germany?\n a. Paris\n b. London\n c. Berlin\n d. Rome",
                2, 'c', answerKey));

        testQuestions.add(new Questions(
                "What is the capital of Italy?\n a. Paris\n b. London\n c. Berlin\n d. Rome",
                3, 'd', answerKey));

        testQuestions.add(new Questions(
                "What is the capital of Spain?\n a. Paris\n b. London\n c. Berlin\n d. Madrid",
                4, 'd', answerKey));

        testQuestions.add(new Questions(
                "What is the capital of Portugal?\n a. Lisbon\n b. London\n c. Berlin\n d. Rome",
                5, 'a', answerKey));

        while (index < testQuestions.size()) {

            Questions current = testQuestions.get(index);

            System.out.println("\n---------------------------------");
            System.out.println("Question " + current.getQuestionId());
            System.out.println(current.getQuestionText());
            System.out.println("Enter answer (a/b/c/d) or 'p' for previous:");

            String input = scanner.nextLine().toLowerCase();

            // Move back
            if (input.equals("p")) {
                if (!history.isEmpty()) {
                    index--;
                    System.out.println("Moved to previous question.");
                } else {
                    System.out.println("No previous question available.");
                }
                continue;
            }

            char studentAnswer = input.charAt(0);
            char correctAnswer = answerKey.get(current.getQuestionId());

            history.push(current);

            if (studentAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

            index++;
        }

        System.out.println("\n--------------------------------");
        System.out.println("Score: " + score + "/" + testQuestions.size());
        System.out.println("-----------------------------------");

        scanner.close();
    }
}
