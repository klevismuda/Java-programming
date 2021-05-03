package Replit.Methods;
import java.util.*;
/*
Create a method called next3.This method has an int argument and prints the next 3 numbers after that number.
Call the method from main method and pass num to it.

flow:
enter number
1
next 3 are:
2 3 4
 */
public class PrintNext3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();
        System.out.println("next 3 are:");
        next3(num);


    }
    public static void next3(int num){
        for (int i = num + 1; i <= num + 3; i++){
            System.out.print(i + " ");
        }

    }
}
