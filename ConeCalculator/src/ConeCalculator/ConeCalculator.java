package ConeCalculator;
import java.util.Scanner;

class Cone {
    private double radius;
    private double height;

    // Setter method to set the radius and height
    public void setDimensions(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the volume of the cone
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    // Method to calculate the surface area of the cone
    public double calculateSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (slantHeight + radius);
    }
}

public class ConeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cone: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double height = scanner.nextDouble();

        Cone cone = new Cone();
        cone.setDimensions(radius, height);

        double volume = cone.calculateVolume();
        double surfaceArea = cone.calculateSurfaceArea();

        System.out.println("Volume of the cone: " + volume);
        System.out.println("Surface Area of the cone: " + surfaceArea);

        scanner.close();
    }
}
