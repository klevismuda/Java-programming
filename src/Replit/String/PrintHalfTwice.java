/*
Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja

input: unity

output: unun
 */
package Replit.String;
import java.util.Scanner;
public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int middleLetter = word.length() / 2;
        //WRITE YOUR CODE HERE
        System.out.println(word.substring(0,middleLetter) + word.substring(0,middleLetter));
    }
}
