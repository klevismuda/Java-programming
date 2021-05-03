package Day18_condition_practice_string_intro;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number to find if it is Fizz, Buzz or FizzBuzz");
        int num = scan.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is FizzBuzz");
        } else if (num % 3 == 0 ) {
            System.out.println(num + " is Fizz");
        } else if (num % 5 == 0 ) {
            System.out.println(num + " is Buzz");
        }

    }

}
