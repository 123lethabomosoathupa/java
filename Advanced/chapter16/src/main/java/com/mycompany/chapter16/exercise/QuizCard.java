package com.mycompany.chapter16.exercise;

/**
 * Represents a single quiz card.
 * Each quiz card contains a question and its corresponding answer.
 *
 * @author letha
 */
public class QuizCard {

    // Stores the quiz question
    private String question;

    // Stores the answer to the question
    private String answer;

    /**
     * Constructor used to create a QuizCard object.
     *
     * @param q The quiz question.
     * @param a The answer to the quiz question.
     */
    public QuizCard(String q, String a) {

        // Initialize the question field
        question = q;

        // Initialize the answer field
        answer = a;
    }

    /**
     * Returns the quiz question.
     *
     * @return The question.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Returns the answer to the quiz question.
     *
     * @return The answer.
     */
    public String getAnswer() {
        return answer;
    }
}