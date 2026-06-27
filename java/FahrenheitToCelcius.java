import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9; // Convert to Celsius
        
        String formattedCelsius = String.format("%.2f", celsius); // Format to 2 decimal places

        System.out.println(" Temperature in Celsius: " + formattedCelsius + "°C");

        scanner.close();
    }
}
