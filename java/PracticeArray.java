import java.util.Scanner;

public class PracticeArray {
    static String[] name = {"Arjay", "Ajhay", "Brix", "Jake",};
    static int choice;



    public static void incrementOrDecrement() {
        while (true) {
            System.out.print("1. Increment 2.Decrement 3.Exit");
            System.out.println();
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            if (choice == 1) {
                for (String s : name) {
                    System.out.println(s);

                }
            } else if (choice == 2) {
                for (int i = name.length - 1; i > -1; i--) {
                    System.out.println(name[i]);

                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public static void main() {


        while (true) {
            try {
                PracticeArray.incrementOrDecrement();
                if (choice == 3) {
                    break;
                }

            } catch (Exception e) {

                System.out.println("invalid input");
                if (choice == 3) {
                    break;
                }
                continue;

            }
        }
    }
}

