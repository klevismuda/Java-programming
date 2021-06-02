package Replit.Arrays;
import java.util.*;
/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix is shown below:
1 2 3
4 5 6
9 8 9
The left-to-right diagonal = 1+5+9 = 15.
The right to left diagonal = 3+5+9 = 17.
Their absolute difference is |15-17| = 2
 */
public class ArraysDiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;
        int leftToRight = matrix[0][0] + matrix[1][1] + matrix[2][2];
        int rightToLeft = matrix[0][2] + matrix[1][1] + matrix[2][0];
        result = leftToRight - rightToLeft;
        System.out.println(Math.abs(result));
    }
    }

