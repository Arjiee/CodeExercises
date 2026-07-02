import java.util.Scanner;

public class WhileLoopCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int maxNumber = scanner.nextInt();

        int counter = 1;

        while (counter <= maxNumber) {
            System.out.println(counter);
            counter++;
        }
        scanner.close();
    }
}
