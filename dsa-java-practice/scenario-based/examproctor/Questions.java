package examproctor;

import java.util.HashMap;

public class Questions {

    private String questionText;
    private int questionId;

    // Constructor automatically registers correct answer
    public Questions(String questionText,
                     int questionId,
                     char correctAnswer,
                     HashMap<Integer, Character> answerKey) {

        this.questionText = questionText;
        this.questionId = questionId;

        // Store actual answer in hashmap at object creation
        answerKey.put(questionId, correctAnswer);
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getQuestionId() {
        return questionId;
    }
}
