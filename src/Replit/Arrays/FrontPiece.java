package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        int[] myArray = new int[2];
        if (num.length >= 2) {
            myArray[0] = num[0];
            myArray[1] = num[1];
        } else if (size < 2) {
            myArray = num;
        }

        System.out.println(Arrays.toString(myArray));
        }


    }


