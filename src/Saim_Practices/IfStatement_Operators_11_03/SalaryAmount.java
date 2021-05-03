package Saim_Practices.IfStatement_Operators_11_03;
/*
[If statements, operators]

Write a program that will accept your salary amount. Then also ask the user if they are full time or not (boolean).
If they are fulltime add 20000 to their salary, but if they are part time then subtract 5000. Print the final salary.
 */
import java.util.Scanner;
public class SalaryAmount {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Write your salary.");
        double salary = scan.nextDouble();
        System.out.println("Are you full time?");
        boolean isFulltime = scan.nextBoolean();

        if (isFulltime == true){
            System.out.println("Your salary is $" + salary + " and have extra $2000 as full time, final salary is $" + (salary+2000));
        }
        else if (isFulltime == false){
            System.out.println("Your salary is $" + salary + " and have extra $500 as part time, final salary is $" + (salary+500));
        }
        else {
            System.out.println("Write true or false!");
        }

    }

}
