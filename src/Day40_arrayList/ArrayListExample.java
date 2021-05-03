package Day40_arrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(10);
        nums.add(12);
        //nums.add("java");

        //reading from arraysList
        System.out.println("Index 0 = " + nums.get(0));
        System.out.println("Index 1 = " + nums.get(1));
        System.out.println("Index 2 = " + nums.get(2));

        System.out.println("nums.size() = " + nums.size());
        //print all values in same line
        System.out.println(nums); // Arrays.toString(numArray)

        nums.remove(1);
        System.out.println(nums);
    }
}
