package Replit.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */
public class TwoDArrayLargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        int biggestNum = arr[0][0];
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                if(biggestNum < arr[r][c]){
                    biggestNum = arr[r][c];
                }
            }
        }
        System.out.println(biggestNum);

    }
}
