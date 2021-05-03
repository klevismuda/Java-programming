package Saim_Practices.LoopPractice.Loops2;
/*
[IQ] PalindromeA word that is the same read forwards and backwards. User takes a word from the console.
Print true if the word is a palindrome. Print false if the word is not palindrome.
-> input: civic
-> output: true
 */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reversed = "";
        for(int i = word.length() -1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        if(word.equals(reversed)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
