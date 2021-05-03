package Replit.String;
/*
Given a String variable word print the middle three characters if the word is an odd number of characters and has more than 5 characters. If the word does not meet the requirements print invalid.

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */
import java.util.Scanner;
public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int middleLetter = word.length() / 2;
        if(word.length() >= 5 && word.length() %2 == 1){
            System.out.println(word.substring(middleLetter - 1, middleLetter + 2));
        } else {
            System.out.println("invalid");
        }
    }
}
