package Replit.String;
import java.util.Scanner;
public class StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        int lastLetter = txt.length() - 1;
        System.out.println(txt.substring(0, lastLetter));
    }
}
