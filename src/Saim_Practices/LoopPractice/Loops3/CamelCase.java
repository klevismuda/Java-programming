package Saim_Practices.LoopPractice.Loops3;
import java.util.Scanner;
/*
Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.
Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
 */
public class CamelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind";
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.println("Number of uppercase letters - " + count);
    }
}
