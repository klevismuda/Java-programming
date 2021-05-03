package OfficeHours.Practice_06_04_2021;

public class Palindrome {
    public static void main(String[] args) {
        String word = "anna";
        boolean isPalindrome = true;
        //Q: What if your String has a million character

        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length() - 1-i)){  // zbrit edhe nga ana tjeter i qe te jete paralele
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
