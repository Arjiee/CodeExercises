import java.util.Scanner;;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest;
        String[] equalNumbers = new String[3];

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        if (num1 == num2 && num1 == num3) {
            equalNumbers[0] = "First number,";
            equalNumbers[1] = "Second number,";
            equalNumbers[2] = "Third number";
        } else if (num1 == num2) {
            equalNumbers[0] = "First number,";
            equalNumbers[1] = "Second number";
        } else if (num1 == num3) {
            equalNumbers[0] = "First number,";
            equalNumbers[1] = "Third number";
        } else if (num2 == num3) {
            equalNumbers[0] = "Second number,";
            equalNumbers[1] = "Third number";
        }

        System.out.println("The largest number is: " + largest);
        if (equalNumbers[0] != null) {
            System.out.print("The following numbers are equal: ");
            for (String equalNum : equalNumbers) {
                if (equalNum != null) {
                    System.out.print(equalNum + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
