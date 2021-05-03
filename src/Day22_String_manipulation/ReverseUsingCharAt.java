package Day22_String_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

        String reversed = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + reversed);
        System.out.println("reversed = " + reversed);

        if(reversed.equalsIgnoreCase(word)){
            System.out.println("Palindrome word");
        } else {
            System.out.println("Not palindrome word");
        }
    }
}
