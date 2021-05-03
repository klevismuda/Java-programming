package Day21_String_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if(first == last){
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }

        String motherWord = "azizaj";
        char firstLetter = motherWord.charAt(0);
        char secondLetter = motherWord.charAt(motherWord.length() - 1);

        if(firstLetter == secondLetter){
            System.out.println(motherWord + " is palindrome");
        } else {
            System.out.println(motherWord + " is not palindrome");
        }
    }
}
