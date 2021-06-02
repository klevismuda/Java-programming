package Replit.ArrayList;
import java.util.*;
/*
Create a static method that:

is called combineAL
returns an ArrayList<Integer>
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2
This method should create a new ArrayList of Strings, add all the words (in order) from wordList1,
then add all the words (in order) from wordList2. In other words, it is combining all the elements from the two parameters.
 */
public class CombineAll {
    public static ArrayList<Integer> combineAL(ArrayList<Integer> wordList1, ArrayList<Integer> wordList2){
        ArrayList<Integer> newList = new ArrayList<>();
       // Collections.sort(wordList1);
       // Collections.sort(wordList2);
        for(int each : wordList1){
            newList.add(each);
        }
        for(int each : wordList2){
            newList.add(each);
        }

        return newList;
    }





    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }
}
