package OfficeHours.Practice_05_25_2021;
import java.util.ArrayList;
import java.util.*;
/*
Remove Duplicates
This method will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.
@param nums-The given ArrayList of numbers
@return -ArrayList of numbers
Ex: Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
 */
public class RemoveDublicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 6, 2, 4, 9, 1, 3, 6));
        System.out.println(removeDub(list));
        System.out.println(removeDub2(list));

    }
    public static ArrayList<Integer> removeDub(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        String checked = "";
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            if (!checked.contains("" + list.get(i))) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }
                checked += ""+list.get(i);
                if (count == 1) {
                    newList.add(list.get(i));
                }
            }
        }
        return newList;
    }
    public static ArrayList<Integer> removeDub2(ArrayList<Integer> list){
        list.removeIf(e -> Collections.frequency(list, e) > 1);
        return list;

    }
}
