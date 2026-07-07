
import java.text.DecimalFormat;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        int number = 0;
        double factorial = 1;

        Scanner userInput = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.print("Enter a positive number: ");
        number = userInput.nextInt();

        while (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number: ");
            number = userInput.nextInt();
        }
        StringBuilder numberExpression = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            numberExpression.append(i);
            if (i < number) {
                numberExpression.append(" * ");
            }
            factorial *= i;
        }
        factorial = Math.round(factorial);

        System.out.println( number + "! =" + numberExpression.toString() + " = " + format.format(factorial));
        //ansarap ng string builder :D
    }
}
