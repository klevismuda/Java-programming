package OfficeHours.Practice_05_05_2021;
import java.util.*;
/*
Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.


Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
Input:   str = "----qwe--r--tyf...gd.---"
Output:  str = "----dgf--y--tre...wq.---"
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(reverseNoSpec(in.next()));
        System.out.println(reverseNoSpec("Ab,c,de!$"));



    }

    public static String reverseNoSpec(String str) {

        char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters)); //[A, b, ,, c, ,, d, e, !, $]

        for (int i = 0, j = letters.length-1; i <= letters.length/2; i++){

            if(Character.isLetter(letters[i])){

                for ( ;j >= 0; j--){
                    if (Character.isLetter(letters[j])){
                        char temp = letters[i]; // A
                        letters[i] = letters[j]; // e
                        letters[j--] = temp;
                        break;
                    }
                }
            }
        }
        //return Arrays.toString(letters).replace("[", "").replace("]", "").replace(", ", "");
        return String.valueOf(letters);

//        int length = str.length()-1;
//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if(Character.isLetter(str.charAt(i))){
//
//                for (int j = length; j >=0 ; j--) {
//
//                    if(Character.isLetter(str.charAt(j))){
//                        result+=str.charAt(j);
//                        length = j-1;
//                        break;
//                    }
//                }
//            }else{
//                result+=str.charAt(i);
//            }
//        }
//        return result;
    }
}
