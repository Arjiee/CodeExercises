import java.util.Scanner;
import java.lang.Math;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        double radius;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula: area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}
