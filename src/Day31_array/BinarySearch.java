package Day31_array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {33,55,123,400};    // Arrays must be ORDERED
        // Arrays.binarySearch(variableName, Value) shows the index
        System.out.println(Arrays.binarySearch(nums, 55)); // 1
        System.out.println(Arrays.binarySearch(nums, 33)); // 0
        System.out.println(Arrays.binarySearch(nums, 20)); // -1
        System.out.println(Arrays.binarySearch(nums, 200)); // -4
        System.out.println(Arrays.binarySearch(nums, 300)); // -4

        // check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 123) >= 0){
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present in array");
        }
    }
}
