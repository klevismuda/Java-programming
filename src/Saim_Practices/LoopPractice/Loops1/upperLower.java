package Saim_Practices.LoopPractice.Loops1;
/*
Write aprogram that will ask ‘upper’ or ‘lower’
•Ifitisupper:printthe alphabet in all uppercase letter from A to Z
•If it is lower: print the alphabet in all uppercase letter from a to z
-Challenge: Also ask if they want to show the alphabet in ascending or  order descending
-Ascending: A –Z or a –z -Descending: Z –A or z –a
 */
import java.util.Scanner;
public class upperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uppercase or Lowercase");
        String UppLowCase = scan.next();
        System.out.println("Ascending or Descending");
        String AscDesOrder = scan.next();
        if(UppLowCase.equals("Uppercase") && AscDesOrder.equals("Ascending")){
            for(char i = 'A'; i <= 'Z'; i++){
                System.out.print(i + " ");
            }
        }
        if(UppLowCase.equals("Uppercase") && AscDesOrder.equals("Descending")){
            for(char i = 'Z'; i >= 'A'; i--){
                System.out.print(i + " ");
            }
        }
        if(UppLowCase.equals("Lowercase") && AscDesOrder.equals("Ascending")){
            for(char i = 'a'; i <= 'z'; i++){
                System.out.print(i + " ");
            }
        }
        if(UppLowCase.equals("Lowercase") && AscDesOrder.equals("Descending")){
            for(char i = 'z'; i >= 'a'; i--){
                System.out.print(i + " ");
            }
        }
    }
}
