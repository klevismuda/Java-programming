package Day10_shorthand_operator;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two value:");
        int rent=scan.nextInt();
        scan.nextLine(); //    IMPORTANT  FIX THE BUG WORK-AROUND
        String month=scan.nextLine();
        System.out.println("Your rent is: $" + rent + " for the " + month);
    }
}
