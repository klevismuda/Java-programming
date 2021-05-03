package Day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(" "));
        String word = null;
        System.out.println(word.toUpperCase());  //NullPointerException
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word)); //true
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));

    }
    public static boolean isNullOrEmpty(String str){
        return str == null || str.isEmpty();

//        if(str == null || str.isEmpty()){
//            return true;
//        }
//        return false;
       /** - if (str.isEmpty || word == null ){ → this will give NullPointerException
            - if(word == null || word.isEmpty()) { → this will be true, NO ERROR
                - if(word == null | word.isEmpty()) { → this will give NullPointerException
                    because you are using one pipe which forces the program to check both sides
        */
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        boolean checkPalindrome = true;
        for (int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                checkPalindrome = false;
                // IF we use RETURN no need to use BREAK
            }
        }
        return checkPalindrome;
    }
    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;

}
}
