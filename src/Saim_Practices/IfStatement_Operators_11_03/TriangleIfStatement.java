package Saim_Practices.IfStatement_Operators_11_03;
/*
A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether the triangle is valid or not.
Print "Valid triangle" or "Not a valid triangle".

    => To make it dynamic change the three angles to be Scanner inputs
 */
import java.util.Scanner;
public class TriangleIfStatement {
    public static void main(String[] args) {
        System.out.println("Write three angles of a triangle");
        Scanner scan = new Scanner(System.in);
        int angle1 = scan.nextInt();
        int angle2 = scan.nextInt();
        int angle3 = scan.nextInt();
        int sum = angle1 + angle2 + angle3;

        if(sum == 180){
            System.out.println("Valid triangle");
        }
        else {
            System.out.println("Not a valid triangle");
        }
    }
}
