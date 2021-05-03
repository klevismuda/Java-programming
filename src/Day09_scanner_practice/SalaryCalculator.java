package Day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate=scan.nextDouble();
        System.out.println("Enter weekly hour");
        int weeklyHour=scan.nextInt();
        System.out.println("Your weekly salary is: $" + hourlyRate*weeklyHour +
                            ", monthly salary is: $" + (hourlyRate * weeklyHour * 52/12) +
                            " and annual salary is: $" + (hourlyRate * weeklyHour * 52));


    }
}
