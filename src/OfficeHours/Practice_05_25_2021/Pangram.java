package OfficeHours.Practice_05_25_2021;

import java.util.Locale;
/*
Pangram –Not ArrayList taskA Pangram is a String that contains all ofthe letters in the alphabet. Createamethodthatwillaccept a String and determine if the given String is a pangram. If itisa pangram return true,otherwisereturnfalse.Example Pangrams: -A quick brown fox jumps over the lazy dog.-Back in June we delivered oxygen equipment of the same size.
 */
public class Pangram {
    public static void main(String[] args) {
       String s = "A quick brown fox jumps over the lazy dog.";
        System.out.println(isParam(s));
    }
    public static boolean isParam(String str){
        str = str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";

//        for (int i = 'a'; i <= 'z'; i++) {
//            System.out.print((char) i);     Kjo eshte per te gjetur abcdefghijklmnopqrstuvwxyz
//        }

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                alp = alp.replace("" + str.charAt(i), "");
            }
        }
        return alp.isEmpty();
    }
}

