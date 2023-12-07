import java.util.Scanner;

class BankAccount {
    private String custName;
    private int custId;
    private double balance;
    private double prevTransaction;

    BankAccount(int id, String name) {
        custId = id;
        custName = name;
    }

    void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            prevTransaction = amount;
        }
    }

    void Withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            prevTransaction = -amount;
        } else {
            System.out.println("No enough balance in the account");
        }
    }

    void Dispbalance() {
        System.out.println("The Balance is: " + balance);
    }

    void GetPreviousTransaction() {
        if (prevTransaction > 0) {
            System.out.println("The amount deposited is Rs. " + prevTransaction);
        } else if (prevTransaction < 0) {
            System.out.println("The amount withdrawn is Rs. " + (-prevTransaction));
        } else {
            System.out.println("No transaction has occurred.");
        }
    }

    void Dispdata() {
        System.out.println("Welcome! Mr." + custName);
        System.out.println("Your CustId is " + custId);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Banking Application");
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter your customer ID: ");
        int customerId = scanner.nextInt();

        BankAccount account = new BankAccount(customerId, customerName);

        char option = '\0';
        double amount = 0;

        System.out.println("C. Check Balance");
        System.out.println("D. Deposit");
        System.out.println("W. Withdraw");
        System.out.println("P. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Enter your choice");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            option = scanner.next().charAt(0);

            switch (option) {
                case 'C':
                    account.Dispbalance();
                    break;
                case 'D':
                    System.out.println("Enter the amount to be deposited");
                    amount = scanner.nextDouble();
                    account.Deposit(amount);
                    break;
                case 'W':
                    System.out.println("Enter the amount to be withdrawn");
                    amount = scanner.nextDouble();
                    account.Withdraw(amount);
                    break;
                case 'P':
                    account.GetPreviousTransaction();
                    break;
                case 'E':
                    System.out.println("Bye!, Thanks for your banking");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        } while (option != 'E');

        scanner.close();
    }
}