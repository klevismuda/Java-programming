package Day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cents=scan.nextInt();
        int dollar=cents/100;
        int remainingCents = cents%100;
        System.out.println("Cents= " + cents);
        System.out.println("Dollar= " + dollar);
        System.out.println("The remainder is: $" + remainingCents);
        System.out.println(cents + " cents equal to $" + dollar + "." +remainingCents);

    }
}
