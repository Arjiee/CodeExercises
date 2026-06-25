
import java.util.Scanner;


public class UserIntroduction {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        String name = userInput.nextLine();
       

        System.out.print("How old are you: ");
        byte age = userInput.nextByte();
        userInput.nextLine();

        System.out.print("What is your favorite hobby: ");
        String hobby = userInput.nextLine();

        System.out.println("Hello, " + name + "!" + "\nYou are " + age + " years old." + "\nYour favorite hobby is " + hobby + ".");


        userInput.close();
    }
}
