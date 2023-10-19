package task1;

import java.util.Random;
import java.util.Scanner;

public class SimpleNumberGuessingGame1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int maxNumber = 100;
		int targetNumber = random.nextInt(maxNumber) + 1;
		int attempts = 0;

		System.out.println("Welcome to the Number Guessing Game!");

		while (true) {
			System.out.print("Guess the number between 1 and " + maxNumber + ": ");
			int userGuess = scanner.nextInt();
			attempts++;

			if (userGuess == targetNumber) {
				System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
				break;
			} else if (userGuess < targetNumber) {
				System.out.println("Too low! Try again.");
			} else {
				System.out.println("Too high! Try again.");
			}
		}

		scanner.close();
	}
}
