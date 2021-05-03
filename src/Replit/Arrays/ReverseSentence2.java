package Replit.Arrays;
import java.util.*;
/*
    Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
Example:
sentence -> Java is fun
reversed > fun is Java
 */
public class ReverseSentence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] ary = sentence.split(" ");
        String words = "";
        for (int i = ary.length - 1; i >= 0; i--){
            words += ary[i] + " ";
        }
        System.out.println(words);
    }
}
