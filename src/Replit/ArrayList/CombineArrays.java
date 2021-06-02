package Replit.ArrayList;
import java.util.*;
/*
Finish the combineRs method to combine the two given String arrays into one arraylist and return the arraylist.
for example:
combineRs(["f","o","o"],[" b","a","r"])
returns [f, o, o, b, a, r]

combineRs(["1","2","3"],["4"])
returns [1, 2, 3, 4]
 */
public class CombineArrays {
    public static ArrayList<String> combineRs(String[] r1,String[] r2){
        ArrayList<String> newList = new ArrayList<>();
        for(int i = 0; i < r1.length; i++){
            newList.add(r1[i]);
        }
        for(int i = 0; i < r2.length; i++){
            newList.add(r2[i]);
        }
        return newList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }
}
