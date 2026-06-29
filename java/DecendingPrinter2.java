import java.util.Scanner;

public class DecendingPrinter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Max number: ");
        int maxNumber = scanner.nextInt();

        System.out.print("Enter Min number: ");
        int minNumber = scanner.nextInt();

        for (int i = maxNumber; i >= minNumber; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
