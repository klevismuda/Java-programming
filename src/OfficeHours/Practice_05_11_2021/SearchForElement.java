package OfficeHours.Practice_05_11_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "Three", "two"));
        System.out.println(findIndex(list, "two"));//1
        System.out.println(findIndex(list, "two"));// -1
        System.out.println(findIndex(list, "two", 2));// 3 because it starts from index 2
        System.out.println(findIndex(list, "two", findIndex(list, "two") + 1)); // its to do more dynamic

/**
 *
 * @param words - List of elements given
 * @param element - The element that we are looking for
 * @return - The method returns the index where the element is found in the given ArrayList
 *              and if the element does not exist the method returns -1
 */


    }
    public static int findIndex (ArrayList<String> words, String element){

        int index = -1; // if doesnt exits it return -1. So -1 is default

        for(int i = 0; i <words.size(); i++){
            if(words.get(i).equals(element)){
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Overloading findIndex method to have a starting point
     * @param words - List of elements given
     * @param element - The element that we are looking for
     * @param startIndex - the index number where the search starts from
     * @return - The method returns the index where the element is found in the given ArrayList
     *              and if the element does not exist the method returns -1
     * @return
     */

    public static int findIndex (ArrayList<String> words, String element, int startIndex){

        int index = -1; // if doesnt exits it return -1. So -1 is default

        for(int i = startIndex; i <words.size(); i++){
            if(words.get(i).equals(element)){
                index = i;
                break;
            }
        }
        return index;
    }
}