package Replit.Arrays;
/*
The code provided in your main method will take in five Strings and save them into an
array called arr. Print out the first three letter of each element on seperate lines.
You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doi
 */

import java.util.*;

public class Printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();

        }
        for (int j = 0; j < arr.length; j++) {
            String word = "";
            word += arr[j];
            word = word.substring(0, 3);
            System.out.println(word);
        }
    }
}
