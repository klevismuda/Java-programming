package Day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic ways of declaring
        System.out.println(nums);// []
        System.out.println("Size = " + nums.size()); // 0

        nums.add(10); nums.add(2);nums.add(23);nums.add(35);nums.add(73);
        nums.add(5);nums.add(7);nums.add(12);nums.add(101);nums.add(120);

        System  .out.println("nums = " + nums);
        nums.remove(3);
        System.out.println("nums = " + nums);

       // nums.remove(88); //IndexOutOfBoundsException
        nums.remove(new Integer(101));  // removes only 1st one
        System.out.println(nums);

        // for loop - iterate through all values and print
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));

        }

        // for each loop, and print all in same line
        for(int each : nums){
            System.out.print(each + " ");
        }
    }
}
