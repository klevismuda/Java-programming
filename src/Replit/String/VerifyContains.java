package Replit.String;

import java.util.Scanner;
/*
Write a program that will verify if the sentence contains word. Print out the result as a boolean value.
 */
public class VerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        if(sentence.contains(word)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
