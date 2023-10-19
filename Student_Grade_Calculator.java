package task2;

import java.util.Scanner;

public class Student_Grade_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Grade Calculator!");
		System.out.print("Enter the number of subjects: ");
		int numSubjects = scanner.nextInt();

		int totalMarks = 0;

		for (int i = 1; i <= numSubjects; i++) {
			System.out.print("Enter marks obtained in Subject " + i + ": ");
			int marks = scanner.nextInt();
			totalMarks = totalMarks + marks;
		}

		double averagePercentage = (double) totalMarks / numSubjects;

		System.out.println("\nResults:");
		System.out.println("Total Marks Obtained: " + totalMarks);
		System.out.println("Average Percentage: " + averagePercentage + "%");
		System.out.println("Grade: " + calculateGrade(averagePercentage));

		scanner.close();
	}

	   static String calculateGrade(double percentage) {
		if (percentage >= 90) {
			return "A+";
		} else if (percentage >= 80) {
			return "A";
		} else if (percentage >= 70) {
			return "B";
		} else if (percentage >= 60) {
			return "C";
		} else if (percentage >= 50) {
			return "D";
		} else {
			return "F";
		}
	}
}
