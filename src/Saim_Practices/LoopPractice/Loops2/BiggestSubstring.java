package Saim_Practices.LoopPractice.Loops2;
/*
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee
Output: ccccc
 */
public class BiggestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddddee";
        String storage = "";
        String max = "";
        for(int i = 0; i < str.length(); i++) {
            for(int j = i; j < str.length(); j++){
            if (str.charAt(i) == str.charAt(j)) {
                storage += str.charAt(j);
            }else {
                i = j - 1;   // very important
                break;
            }
        }
        if (storage.length() > max.length())
            max = storage;

        storage = "";
    }
        System.out.println("Biggest substring: " + max);
}
}

