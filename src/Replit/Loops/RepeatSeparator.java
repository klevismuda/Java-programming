package Replit.Loops;
import java.util.Scanner;
/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

        Example:
        input:
        Word
        X
        3
        output: WordXWordXWord

        Example:
        input:
        This
        And
        2
        output: ThisAndThis

 */
public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        for (int i = 1; i <= count; i++) {
            if(i == 1){
                System.out.print(word);
            } if(i >= 2){
                System.out.print(separator + word);
            }
        }

    }
}
