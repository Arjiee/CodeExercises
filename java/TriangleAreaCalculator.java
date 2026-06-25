import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        double base;
        double height;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();

        // Calculate the area of the triangle using the formula: area = (1/2) * base * height
        // double area = 0.5 * base * height;
        // double area = base * height * 0.5 ;
        double area = 1.0/2.0 * base * height;

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}
