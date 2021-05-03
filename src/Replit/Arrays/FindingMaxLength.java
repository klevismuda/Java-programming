package Replit.Arrays;
/*
Given the array words find and print the word with the largest length. Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
Outputs: jaaaaavvaaaaaaaaaa
 */
import java.util.*;
public class FindingMaxLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
        String longestWord = words[0];
        for (int j = 1; j < words.length; j++){
            int maxLength = words[0].length();
            if(words[j].length() > longestWord.length()){
                longestWord = words[j];
            }

        }
        System.out.println(longestWord);
    }
}
