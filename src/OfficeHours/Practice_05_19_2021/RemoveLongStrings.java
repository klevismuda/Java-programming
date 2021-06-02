package OfficeHours.Practice_05_19_2021;

import Day41_arraylist.ArrayAsList;

import java.util.ArrayList;
import java.util.Arrays;

/*
This method will accept an ArrayList of Strings and an int.
Remove any String elements that have less characters than the given number.
Return the modified ArrayList of Strings@param list -Given ArrayList of Strings@param int -max number of characters
@return -ArrayList of StringsEx: {“one,”, “two”, “three, “four”, “five”, “six”}Max number: 4Output: {“three, “four”, “five”
 */
public class RemoveLongStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(RemoveLongStrings(list, 4));

    }

    public static ArrayList<String> RemoveLongStrings(ArrayList<String> list, int minLength) {
        list.removeIf(k -> k.length() < minLength);
                return list;
        /**
         * Predicate is removeIf. Search about the meaning
         */

//        ArrayList<String> validString = new ArrayList<>();
//        for (String each : list) {
//            if (each.length() > minLength) {
//                validString.add(each);
//            }
//
//        }
//        return validString;

    }

}
