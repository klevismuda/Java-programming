package OfficeHours.Practice_06_04_2021;
/*
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee
Output: ccccc
 */
public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddeeeeeee";
        String longestSubstring = "";
        String temp = "";
        str = str + " ";
        for(int i = 0; i < str.length() - 1; i++){

            temp += str.charAt(i);
            if(str.charAt(i) != str.charAt(i + 1)){

                if(temp.length() > longestSubstring.length()){
                    longestSubstring = temp;
                }

                temp = ""; // do empty after changing the value of longestSubstring

            }
        }
        System.out.println("Longest substring is " + longestSubstring);
    }
}
