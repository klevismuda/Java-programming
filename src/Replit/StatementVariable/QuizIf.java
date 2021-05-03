package Replit.StatementVariable;

import java.util.Scanner;

public class QuizIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number");
        int monthNum = 11;
        switch (monthNum){
            case 10:
                System.out.println("January");

            case 11:
                System.out.println("February");

            case 12:
                System.out.println("March");

            default:
                System.out.println("Invalid month number");

        }
    }
}
