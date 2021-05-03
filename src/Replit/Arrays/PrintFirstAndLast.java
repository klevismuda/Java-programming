package Replit.Arrays;
/*
Given a String array words, iterate through each word and print first and last
letter of each element in separate lines.
Example:
words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
 */
import java.util.*;
public class PrintFirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String word = "";
        String firstLast = "";
        String last = "";
        for(int i = 0; i < words.length; i++){
            word = "";
            word += words[i] + "";
            firstLast += ""+ word.charAt(0) + word.charAt(word.length()-1) + ", ";
            last = firstLast.substring(0, firstLast.length()-2);
        }

        System.out.println(Arrays.toString(new String[]{last}));
    }

}
