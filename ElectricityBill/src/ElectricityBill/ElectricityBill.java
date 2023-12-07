package ElectricityBill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectricityBill {
    private String customerName;
    private int unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, int unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        calculateBillAmount();
    }

    private void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.20;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 1.20 + (unitsConsumed - 100) * 2;
        } else {
            billAmount = 100 * 1.20 + 200 * 2 + (unitsConsumed - 300) * 3;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getBillAmount() {
        return billAmount;
    }
}

class ElectricityBillManagementSystem {
    private List<ElectricityBill> bills;

    public ElectricityBillManagementSystem() {
        bills = new ArrayList<>();
    }

    public void addBill(String customerName, int unitsConsumed) {
        ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);
        bills.add(bill);
    }

    public void displayAllBills() {
        System.out.println("------ Electricity Bill Management System ------");
        for (ElectricityBill bill : bills) {
            System.out.println("Customer Name: " + bill.getCustomerName());
            System.out.println("Units Consumed: " + bill.getUnitsConsumed());
            System.out.println("Bill Amount: $" + bill.getBillAmount());
            System.out.println("----------------------------------------------");
        }
    }
}

 class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectricityBillManagementSystem billManagementSystem = new ElectricityBillManagementSystem();

        boolean exit = false;
        while (!exit) {
            System.out.println("------ Electricity Bill Management System ------");
            System.out.println("1. Add Bill");
            System.out.println("2. Display All Bills");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    scanner.nextLine(); // Consume the newline character
                    String customerName = scanner.nextLine();

                    System.out.print("Enter units consumed: ");
                    int unitsConsumed = scanner.nextInt();

                    billManagementSystem.addBill(customerName, unitsConsumed);
                    System.out.println("Bill added successfully!");
                    break;

                case 2:
                    billManagementSystem.displayAllBills();
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}