package Replit.Methods;
/*
Complete the method isPalindrome() that will check if number is a palindrome.
Print your result as a boolean (true or false).
Challenge: Do not convert int into a string!

Examples:
input: 1001
output: true

input: 1234
output: false
 */
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        boolean palindrome = false;
        int reminder = 0;
        int reveredNum = 0;
        int temp = num;

        do{
            reminder = temp % 10;
            reveredNum = reveredNum * 10 + reminder;
            temp /=10;
        } while(temp != 0);

        if(reveredNum == num){
            palindrome = true;
        }
        System.out.println(palindrome);


    }

}
