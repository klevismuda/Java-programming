package Day09_scanner_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int sum=num1+num2;
        System.out.println("First number is: " + num1 + ", second number is: " + num2 + " and result is :" + sum);
    }
}
