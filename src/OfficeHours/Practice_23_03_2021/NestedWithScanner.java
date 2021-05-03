package OfficeHours.Practice_23_03_2021;
import  java.util.Scanner;
public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if(num > 0){
            System.out.println("Enter a single word");
            String word = input.next();

            if(word.length() % 2 == 0){
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }
        } else {
            System.out.println("Enter a character");
            char letter = input.next().charAt(0);
            /*
            [Character Checker]
Given a letter (char) determine if the character is an uppercase letter or lowercase letter
Ex: 'b' --> lowercase
'G' --> uppercase
'O' --> uppercase
Hint: Use the ASCII table
             */
            if(letter >= 'A' && letter <= 'Z'){  // if (letter >= 65 && letter <= 90)
                System.out.println(letter + " is uppercase letter");
            } else if(letter >= 'a' && letter <= 'z'){
                System.out.println(letter + " is lowercase letter");
            } else {
                System.out.println(letter + " is not a valid letter");
            }
        }

    }
}
