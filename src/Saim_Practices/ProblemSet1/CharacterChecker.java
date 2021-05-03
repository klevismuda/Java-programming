package Saim_Practices.ProblemSet1;
/*
Given a letter (char) determine if the character is an uppercase letter or lowercase letter
Ex: 'b' --> lowercase
'G' --> uppercase
'O' --> uppercase
Hint: Use the ASCII table
 */
import java.util.Scanner;
public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letter = scan.next().charAt(0);
        if(letter >= 'A' && letter <= 'Z'){
            System.out.println("uppercase");
        } else {
            System.out.println("lowercase");
        }
    }
}
