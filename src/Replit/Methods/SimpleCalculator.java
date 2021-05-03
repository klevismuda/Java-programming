package Replit.Methods;
import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();
        plus(num1, num2);
    }
    public static void plus(int num1, int num2){
        System.out.println("result: " + (num1 + num2));

    }
}
