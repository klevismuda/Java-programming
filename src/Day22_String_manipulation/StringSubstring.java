package Day22_String_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1) word.substring(startingIndex, endIndex)
         */

        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(5, 7));
        System.out.println(word.substring(8));  // fun

        // System.out.println(word.substring(3, 30));  // StringIndexOutOfBoundsException   out of range
        /**
         * 2) word.substring(startingIndex) it will read from starti to end
         */
        System.out.println(word.substring(5)); //is fun
    }
}
