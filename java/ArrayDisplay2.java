import java.util.Scanner;

public class ArrayDisplay2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            int newNumber = scanner.nextInt();
            numbers[i] = newNumber;
        }

        System.out.println("The number you've entered:");

        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }

}