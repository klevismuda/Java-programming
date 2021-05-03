package Replit.StatementVariable;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number of milligrams in drink");
        int caffeine = scan.nextInt();
        int overdose = 100/caffeine;
        //int numOfMilligrams = scan.nextInt();
        //int overdose = 10*1000 / numOfMilligrams;
        System.out.println("It would take about " +overdose + " drinks for a lethal overdose.");

    }
}
