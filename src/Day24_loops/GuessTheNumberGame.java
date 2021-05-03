package Day24_loops;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        // System.out.println(randomNum.nextInt(101));
        int secretNumber = randomNum.nextInt(101);  // Number between 1-100
        int guessingNumber = 0;
        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();   //  or we can put randomNum.nextInt(101) to play computer with computer
            if(guessingNumber > secretNumber){
                System.out.println("Wrong, your number is too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, your number is too small");
            }

        } while(guessingNumber != secretNumber);
        System.out.println("Congratulations, you won! secret number: " + secretNumber);
    }
}
