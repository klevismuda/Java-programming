package Day31_array;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5, 1, 7, 0};
        System.out.println(Arrays.toString(nums));  // [5, 1, 7, 0]
        Arrays.sort(nums);  // we have to sort firstly
        System.out.println(Arrays.toString(nums)); // [0, 1, 5, 7]

        System.out.println("Min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        //Arrays.sort(nums, Collections.reverseOrder());

        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"}; // 'A' is different with 'a'     is ascending
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));
    }
}
