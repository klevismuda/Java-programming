package Replit.Arrays;
import java.util.*;
/*
Given a String variable sentence, write code to type each word in separate lines.
Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */
public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] sentArray = sentence.split(" ");
        for (String each : sentArray){
            System.out.println(each);
        }
    }
}
