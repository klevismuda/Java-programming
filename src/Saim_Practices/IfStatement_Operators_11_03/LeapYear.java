package Saim_Practices.IfStatement_Operators_11_03;
/*
[If statements, operators]

Create a program that will accept a year. Check if the year is a leap year.
If it is a leap year print "$year is a leap year" otherwise print "$year is not a leap year"

Hint: Lets say if a number is evenly divisible by 4 it is a leap year
 */
import java.util.Scanner;
public class LeapYear {
    public static void main (String[]args){
        System.out.println("Check if the year is a leap year!");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year % 4 == 0){
            System.out.println(year + " year is a leap year");
        }
        else
            System.out.println(year + " year is not a leap year");
    }
}
