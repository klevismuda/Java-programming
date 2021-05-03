package Saim_Practices.LoopPractice.Loops3;
import java.util.Scanner;
/*
Reverse only second wordGiven a String with three words separated by spaces.
Reverse only the second word and return the modified String
Ex:I love java
I evol java
 */
public class ReverseOnlySecondWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String text = scan.nextLine();
//        int firstSpace = text.indexOf(" ");
//        String afterSpace = text.substring(firstSpace+1);
//        int secondSpace = afterSpace.indexOf(" ");
//        String secondWord = afterSpace.substring(0, secondSpace);
//        String textReversed = "";
//        for (int i = secondWord.length()-1; i >= 0; i--){
//            textReversed += secondWord.charAt(i);
//        }
//        System.out.println(text.substring(0, firstSpace +1) + textReversed + afterSpace.substring(secondWord.length()));


        /**
         * Second version
         */

        int start = text.indexOf(" ");
        int end = text.lastIndexOf(" ");
        String textReversed = "";
        String secondWord = text.substring(start + 1, end);
        for (int i = secondWord.length() - 1; i >= 0; i--) {
            textReversed += secondWord.charAt(i);
        }
        System.out.println(text.substring(0, start +1) + textReversed + text.substring(end));
        System.out.println(textReversed);
    }
}
