package Day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        //declare String arraylist and add values
        List<String> strings = new ArrayList<>(Arrays.asList("Albania", "USA", "Italy"));
        //pass the words list to printStrList method
        printStrList(strings);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 23, 54554, 234, 11, 5, 2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

        /**
         methodName: printStrList
         param: List of String
         return: void
         print value separated by space line
         */
    }
    public static void printStrList(List<String> strings){   // CTRL + Space it gives suggestions how to give name
        for (String each : strings){
            System.out.print(each + " ");
        }
    }

    /**
     method : sumIntegerList
     param: List of integers
     returns int
     calculates sum of integers in the list then returns
     */

    static public int sumIntegerList(List<Integer> list) {
        int sum = 0;
        for(int i : list) {
            sum += i;
        }
        return sum;
    }
}
