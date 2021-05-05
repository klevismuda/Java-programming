package Day42_arrayList;
import java.util.*;
public class UniqueFromList {
    public static void main(String[] args) {
        // declare Integer arrayList with following  numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6));
        extracted(nums);
        System.out.println();
        //loop through list
//        for (int each : nums) {   // Another way
//            //check if frequency is 1
//            if (Collections.frequency(nums, each) == 1){
//                System.out.print(each + " ");
//            }
//        }

        /**
         * Select all content you want to add as method, then click right, refactor the Extract Method
         */
    }

    private static void extracted(List<Integer> nums) {  // we can  change from private to public
        List<Integer> uniqueNums = new ArrayList<>();


        for(int i = 0; i < nums.size(); i++){
            if(Collections.frequency(nums, nums.get(i)) == 1){
                System.out.print(nums.get(i) + " ");
                uniqueNums.add(nums.get(i));
            }
        }
        System.out.println("uniqueNums = " + uniqueNums);
    }
}
