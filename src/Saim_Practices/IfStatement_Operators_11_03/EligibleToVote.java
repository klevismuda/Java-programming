package Saim_Practices.IfStatement_Operators_11_03;
import java.util.Scanner;

/*
[If statement, operators]

Write a java program that can identify if a person is eligible to vote for the president. Age of voting: 18.
Print "Eligible to vote" or "not eligible to vote".

    => To make it dynamic change the three angles to be Scanner inputs
 */

public class EligibleToVote {
    public static void main(String[] args) {
        System.out.println("Write your age if a person is eligible to vote for the president");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age >= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
    }
}
