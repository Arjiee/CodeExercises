import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 9, 23, 18};
        int searchValue;
        boolean found = false;
        int index = 0;

        while (found == false) {

            System.out.print("Enter a number to search for: ");
            Scanner scanner = new Scanner(System.in);
            searchValue = scanner.nextInt();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == searchValue) {
                    found = true;
                    index = i;
                    break;
                }
            }

            if (found) {
            System.out.println("Number "+searchValue + " was found in the array at index "+index+".");
            } else {
            System.out.println("Number "+searchValue + " not found in the array.");
            }

            scanner.close();

        }


    }

}
