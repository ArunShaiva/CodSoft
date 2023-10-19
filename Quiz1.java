package task4;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Define quiz questions and answers
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the 'Red Planet'?"
            // Add more questions here
        };

        String[] options = {
            "1. London\n2. Berlin\n3. Madrid\n4. Paris",
            "1. Mars\n2. Venus\n3. Earth\n4. Jupiter"
            // Add corresponding options for each question
        };

        int[] correctAnswers = {4, 1};

        // Display and evaluate each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);

            System.out.print("Enter the number of your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
            }
        }

        // Display the final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.length);
        System.out.println("Correct Answers: " + score);
    }
}
