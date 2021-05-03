package Replit.Arrays;
import java.util.*;
/*
Declare and create a two-dimensional array of ints called values, with 2 rows, and initialize the first row to 8, 20, 50
and the second row to 12, 30, 75.
 */
public class TwoDArraysDeclare {
    public static void main(String[] args) {
        int[][] values = {{8, 20, 50}, {12, 30, 75}};

        System.out.println(Arrays.deepToString(values));
    }
}
