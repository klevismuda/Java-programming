package Replit.StatementVariable;
/*
Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:

Display x if x is greater than or equal to 5
Display -x if x is less than 5 (flip sign - negative/positive)

DO NOT USE IF STATEMENT or SWITCH CASE
 */
import java.util.Scanner;
public class TernaryOperator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();

        int display = (x >= 5) ? x : -x;
        System.out.println(display);
    }
}
