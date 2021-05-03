package Day14_Multi_branch_If_Statements;
import java.util.Scanner;
public class MultiBranchIfStatement {
    public static void main(String[] args) {
        System.out.println("Write number from 1 to 7 to display days");
        Scanner scan = new Scanner(System.in);
        int day =scan.nextInt();

        if (day == 1){
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wesday");
        }
        else if (day == 4) {
            System.out.println("Thursday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }
        else if (day == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Enter 1-7");
        }

    }
}
