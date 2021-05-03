package Replit.StatementVariable;
/*
Write an expression using the ternary that compares the values of the variables num1 and num2. The result from the ternary should be the bigger number from the two numbers.

Example:
Enter number1:
-5
Enter number2:
5
Output: 5

Enter number1:
9
Enter number2:
3

Output: 9
 */
import java.util.Scanner;
public class TernaryOperator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        int bigger = (num1 > num2) ? num1 : num2;
        System.out.println(bigger);
    }
}
