package Replit.Loops;
import java.util.Scanner;
/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:
Input: howdyho
Output: oo

Input: huehuehuehue
Output: ueueueue
 */
public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
                    word.charAt(i) == 'u' || word.charAt(i) == 'o'){
                System.out.print(word.charAt(i));

            }
        }
    }
}
