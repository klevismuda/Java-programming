package Saim_Practices.LoopPractice.Loops1;
/*
•Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
•Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */
public class OddEvenNumbersDiv {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0){   // f(i % 2 == 1) FOR odd numbers
                System.out.println(i);
            }

            if(i % 2 == 1 && i % 3 == 0 && i % 5 == 0){   // f(i % 2 == 1) FOR odd numbers
                System.out.println(i);
            }
        }
    }
}
