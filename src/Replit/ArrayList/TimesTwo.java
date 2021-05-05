package Replit.ArrayList;
import java.util.*;
/*
Create a method that:
is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
 */
public class TimesTwo {

    public static ArrayList<Integer> timesTwo (List<Integer> nums){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int each : nums) {
            newList.add(each*2);

        }

        return newList;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
