package Replit.Arrays;
import java.util.*;
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.

Example:
nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */
public class FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),
                        input.nextInt(),input.nextInt(),input.nextInt()};
        int nonDuplicated = nums[0];
        int count = 0;
        for (int eachNum : nums) {
            count =0;
            for (int i= 0; i < nums.length;i++) {
                if (eachNum==nums[i]) {
                    count++;
                }
            }
            if (count ==1) {
                nonDuplicated = eachNum;
                break;
            }

        }
        System.out.println(nonDuplicated);
            }
        }

