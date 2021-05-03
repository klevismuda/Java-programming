package Replit.StatementVariable;
import java.util.Scanner;
public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter seconds:");
        int inputSeconds, hours, minutes, seconds;
        inputSeconds=scan.nextInt();
        hours=inputSeconds/(60*60);
        minutes=inputSeconds/60-(hours*60);
        seconds=inputSeconds%60;
        System.out.println(hours+" hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
