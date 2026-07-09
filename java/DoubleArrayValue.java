import java.util.Scanner;

public class DoubleArrayValue {
    public static void main(String[] args) {
            int numbers[] = {};
            int doubleValue[] = {};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            int size = scanner.nextInt();
            numbers = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.println("You entered: \n" + java.util.Arrays.toString(numbers));
            System.out.println("Number in the array doubled: ");
            doubleValue = numbers;
            for (int i = 0; i < size; i++) {
                doubleValue[i] = numbers[i] * 2;
            }
            System.out.println(java.util.Arrays.toString(doubleValue));
            scanner.close();
    }

}