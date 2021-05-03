package Day38_methods;
/**
 * import all static methods. so that you can just call by method name
 */

import static Day38_methods.StringUtils.*; // import all methods from StringUtils class . So no nedd to write StringUtils.

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be null or empty");
        }
        System.out.println("isPalindrome(\"civic\") = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(\"kayak\") = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(\"cybertek\") = " + isPalindrome("cybertek"));  // Ska nevoje te shenohet StringUtils.isPalindrome


        String word = "sunday";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtils.reverse(word));
    }

}
