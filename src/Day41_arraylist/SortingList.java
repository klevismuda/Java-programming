package Day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(120, 3, 1));
        System.out.println("nums before sort = " + nums);

        Collections.sort(nums);  // Arrays.sort() is used for Arrays
        System.out.println("nums after sort= " + nums);
    }
}
