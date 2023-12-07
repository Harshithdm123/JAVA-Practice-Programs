package Valume;
import java.util.Scanner;

public class Valume{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder (in meters): ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder (in meters): ");
        double cylinderHeight = scanner.nextDouble();

        System.out.print("Enter the radius of the cone (in meters): ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cone (in meters): ");
        double coneHeight = scanner.nextDouble();

        // Calculate the volumes
        double cylinderVolume = Math.PI * cylinderRadius * cylinderRadius * cylinderHeight;
        double coneVolume = (1.0 / 3.0) * Math.PI * coneRadius * coneRadius * coneHeight;

        // Display the results
        System.out.println("Volume of the cylinder: " + cylinderVolume + " cubic meters");
        System.out.println("Volume of the cone: " + coneVolume + " cubic meters");

        scanner.close();
    }
}
