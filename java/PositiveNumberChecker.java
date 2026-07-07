import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        do {
            if (number > 0) {
                System.out.println("Thank you! You entered: " + number);
            } else {
                System.out.println("Invalid. Please enter a positive number: ");
                number = scanner.nextInt();
                System.out.println("Thank you! You entered: " + number);
            }
        } while (number <= 0);
    }
}
