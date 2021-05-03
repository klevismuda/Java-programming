package Replit.StatementVariable;
/* Write a switch statement that tests the value of the char variable response and performs the following actions:

        if response is y, print: "Your request is being processed is printed"
        if response is n, print: "Thank you anyway for your consideration is printed"
        if response is h, print: "Sorry, no help is currently available is printed"
        for any other value of response, print: "Invalid entry, please try again!"
        Example:

        Display prompt: Enter command:
        input: y
        Display prompt: Your request is being processed

 */
import java.util.Scanner;
public class SwitchChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char letter = scan.next().charAt(0);
        switch (letter){
            case 'y':
                System.out.println("Your request is being processed is printed");
                break;
            case 'n':
                System.out.println("Thank you anyway for your consideration is printed");
                break;
            case 'h':
                System.out.println("Sorry, no help is currently available is printed");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }

    }
}
