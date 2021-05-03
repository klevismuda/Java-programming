package Saim_Practices.LoopPractice.Loops3;

import java.util.Scanner;

/*
Given a number. Print out all the prime numbers from 2 to that numberA prime number is
a number that is only divisible by 1 and itself.
Ex:Input:50
Output:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
