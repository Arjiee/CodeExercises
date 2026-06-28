import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the score: ");
        char grade = 'F'; // Default grade
        byte score = scanner.nextByte();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            scanner.close();
            return;
        } else if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
