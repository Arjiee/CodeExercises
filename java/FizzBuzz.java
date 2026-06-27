import java.util.Scanner;

public class FizzBuzz {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if ( num % 5 == 0 && num % 3 == 0) {
            System.out.println("FizzBuzz");
        }else if (num % 5 == 0) {
            System.out.println("Buzz");
        }else if(num % 3 == 0) {
            System.out.println("Fizz");
        }
//        else{
//            System.out.println("FizzBuzz");
//        }
    }
}
