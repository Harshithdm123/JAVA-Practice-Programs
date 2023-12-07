package AreaCalculator;

import java.util.Scanner;

public class AreaCalculator {

    public static double calculateArea(double side) {
        return side * side; // Area of a square
    }

    public static double calculateArea(double length, double breadth) {
        return length * breadth; // Area of a rectangle
    }

    public static double calculateArea(double a, double b, double c) {
        // Area of a triangle using Heron's formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        System.out.print("Enter the first side of the triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double c = scanner.nextDouble();

        double squareArea = calculateArea(side);
        double rectangleArea = calculateArea(length, breadth);
        double triangleArea = calculateArea(a, b, c);

        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the triangle: " + triangleArea);

        scanner.close();
    }
}