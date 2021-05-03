package Saim_Practices.LoopPractice.Loops1;
/*
•Write a program that can calculate the sum of all the even numbers between 1 ~ 100
•Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */
public class sumOfAllTheEvenOdd {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){   // f(i % 2 == 1) FOR odd numbers
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers is " + sum);
    }
}
