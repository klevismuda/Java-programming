package Day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodWithReturnList {
    public static void main(String[] args) {
        //1 second = 1_000_000_000 of a nanosecond
        long start = System.nanoTime();
        /**
         * Calculate time to run ArrayList and Array
         * System.nanoTime();
         */
        //System.out.println(getIntegerList());
        List<Integer> mlnNums = getIntegerList();
        long end = System.nanoTime();
        double secondsArrayList = (end - start) / 1_000_000_000.0;
        System.out.println("Arraylist time = " + (end - start));
        System.out.println("ArrayList time seconds " + secondsArrayList);


        //System.out.println(mlnNums);
        long st = System.nanoTime();
        int[] arr = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time seconds " + seconds);
        //System.out.println(arr);
    }
    /**
     * getIntegerList
     * return list<Integer>
     *     Loop from 0 - 1_000_000
     *
     */
    public static List<Integer> getIntegerList (){
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 1000_000; i++){
            nums.add(i);
        }
        return nums;
    }

    /**
     **getIntegerArray
     * no param
     * return int[]
     * Loop from 0 - 1_000_000
     */

    public static int[] getIntegerArray() {
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        for(int i = 1; i < 1_000_001; i++){
            nums[i] = i;
        }
        return nums;
    }

    /**
     * getDays
     */
}
