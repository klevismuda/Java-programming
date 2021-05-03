package Replit.Arrays;
/*
The code provided in your main method will take in eight Strings and save them into an array arr.
Print out the 4 lines using for loop: each line should contain a pair of array elements
Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
Output:
apple , banana
kiwi , grape
milk, soda
juice, coffee
 */
import java.util.*;
public class Printing02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }

        for(int i = 0; i < arr.length-1; i+=2){
            System.out.println("" + arr[i] + ", " + arr[i+1]);
        }
    }
}
