package Replit.Arrays;
/*
Given an int array nums print a new array with double the length where its last element is the same as the original array,
and all the other elements are 0. The original array will be length 1 or more.
Hint: by default, a new int array contains all 0's.

Examples:
input: 4 5 6
output: [0, 0, 0, 0, 0, 6]

input: 0
output: [0, 0]

input: 1 2 3 4
output: [0, 0, 0, 0, 0, 0, 0, 4]
 */
import java.util.*;
public class MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int [] newArr = new int[size*2];
        for(int i = 0;i<size*2;i++){

            if (i==newArr.length-1){
                newArr[newArr.length-1]= nums[nums.length-1];

            }else{
                newArr[i] = 0;
            }


        }
        System.out.println(Arrays.toString(newArr));

    }
}
