package Day18_condition_practice_string_intro;
import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("number " + " is positive.");
        } else if (num < 0) {
            System.out.println("number " + " is negative.");
        } else {
            System.out.println("number " + " is zero.");
        }
    }
}
