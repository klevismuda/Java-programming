package Replit.Methods;
import java.util.*;
/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.`
Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */
public class PrintUniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        for (int i = 0; i < nums.length; i++){
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++){
                if(i != j && nums[i] == nums[j]){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                System.out.println(nums[i]);
            }
        }
    }
}
