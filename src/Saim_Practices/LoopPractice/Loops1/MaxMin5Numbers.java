package Saim_Practices.LoopPractice.Loops1;
import java.util.Scanner;
/*
•Write a program that can ask the user "enter a number" five times and return the maximum number
•Write a program that can ask the user "enter a number" five times and return the minimum number
 */
public class MaxMin5Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        int max = num;  // Very important
        int min = num;
        for(int i = 1; i <= 4; i++){
            System.out.println("Enter number");
            num = scan.nextInt();
            if(num > max){
                max = num;
            }if(num < min){
                min = num;
            }
        }
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }
}
