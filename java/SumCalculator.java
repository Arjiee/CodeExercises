import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int initialNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int initialNumberCopy = initialNumber; //store initial for reference in the output message

        int sum = 0;
        // for (int i = initialNumber; i <= secondNumber; i++) {
        //     sum += i;
        // }
        StringBuilder numbers = new StringBuilder();


        while (initialNumber <= secondNumber) {
            if (initialNumber != secondNumber) {
                numbers.append(initialNumber).append(" + ");
            } else {
                numbers.append(initialNumber);
            }
            sum += initialNumber;
            initialNumber++;
        }

        System.out.println("The sum of numbers from " + initialNumberCopy + " to " + secondNumber + " is: " + sum);
        System.out.println(numbers.toString() +" = " + sum);
        scanner.close();
    }
}