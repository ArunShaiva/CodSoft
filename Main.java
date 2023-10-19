package task3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankAccount userAccount = new BankAccount(1000.0); // Initial balance

		ATM atm = new ATM(userAccount);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			atm.displayMenu();
			System.out.print("Select an option (1-4): ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				atm.checkBalance();
				break;
			case 2:
				System.out.print("Enter the deposit amount:  $");
				double depositAmount = scanner.nextDouble();
				atm.deposit(depositAmount);
				break;
			case 3:
				System.out.print("Enter the withdrawal amount: $");
				double withdrawAmount = scanner.nextDouble();
				atm.withdraw(withdrawAmount);
				break;
			case 4:
				System.out.println("Thank you for using the ATM!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}
}
