package Saim_Practices.IfStatement_Operators_11_03;
/*
Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5

Ex:
number = 65

Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */
import java.util.Scanner;
public class BooleanOperatorsDivisible {
    public static void main(String[] args) {
        System.out.println("Is number divisible by 2, 3, and 5 ??");
        int num = 65;
        boolean answer = num %2 == 0;
        System.out.println("65 is divisible by 2: " + answer);

        boolean answer1 = num %3 == 0;
        System.out.println("65 is divisible by 3: " + answer1);

        boolean answer2 = num %5 == 0;
        System.out.println("65 is divisible by 5: " + answer2);

    }
}
