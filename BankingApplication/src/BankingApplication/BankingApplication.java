package BankingApplication;

import java.util.Scanner;

class BankAccount {
    private int custid;
    private String custname;
    private double balance;
    private double previousTransaction;

    public BankAccount(int custid, String custname) {
        this.custid = custid;
        this.custname = custname;
        this.balance = 0;
        this.previousTransaction = 0;
    }

    public void dispdata() {
        System.out.println("Welcome! Mr. " + custname);
        System.out.println("Your CustId is " + custid);
    }

    public void dispbalance() {
        System.out.println("The Balance is: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
            System.out.println("The amount deposited is Rs. " + amount);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            previousTransaction = -amount;
            System.out.println("The amount withdrawn is Rs. " + amount);
        } else {
            System.out.println("Not enough balance in the account for withdrawal.");
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("The amount deposited is Rs. " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("The amount withdrawn is Rs. " + Math.abs(previousTransaction));
        } else {
            System.out.println("No previous transaction available.");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your CustId: ");
        int custid = input.nextInt();
        input.nextLine(); // Consume the newline character
        System.out.print("Enter your CustName: ");
        String custname = input.nextLine();

        BankAccount account = new BankAccount(custid, custname);

        while (true) {
            System.out.println("C. Check Balance");
            System.out.println("D. Deposit");
            System.out.println("W. Withdraw");
            System.out.println("P. Previous Transaction");
            System.out.println("E. Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
            char choice = input.next().charAt(0);

            switch (choice) {
                case 'C':
                    account.dispbalance();
                    break;
                case 'D':
                    System.out.print("Enter the amount to be deposited\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 'W':
                    System.out.print("Enter the amount to be withdrawn\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 'P':
                    account.getPreviousTransaction();
                    break;
                case 'E':
                    System.out.println("Bye!, Thanks for your banking");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
