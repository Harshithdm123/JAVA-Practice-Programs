package Arithe;

import java.util.Scanner;

public class Arithe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + sub(num1, num2));
        System.out.println("Multiplication: " + mul(num1, num2));
        System.out.println("Division: " + div(num1, num2));

        scanner.close();
    }

    // Static method to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Static method to perform subtraction
    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    // Static method to perform multiplication
    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    // Static method to perform division
    public static double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
