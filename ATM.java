package task3;

public class ATM {
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void displayMenu() {
	        System.out.println("Welcome to the ATM!");
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Exit");
	    }

	    public void checkBalance() {
	        System.out.println("Your balance is: ₹ " + account.getBalance());
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            account.deposit(amount);
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (account.withdraw(amount)) {
	                System.out.println("Withdrawn: $" + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
	}

