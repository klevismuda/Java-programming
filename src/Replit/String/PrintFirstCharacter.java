package Replit.String;
import java.util.Scanner;
public class PrintFirstCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(word.charAt(0));
    }
}
