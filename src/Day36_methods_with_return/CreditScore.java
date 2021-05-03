package Day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(720);
        checkEligible(500);
       // System.out.println(checkEligible(400)); // ERROR - cannot print void method
        System.out.println("CreditScore " + getCreditScore());
        System.out.println(isPalindrome("civic"));
    }

    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("You are eligible for leasing this car");
        } else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }

    }

    public static int getCreditScore() {
        return 800;
    }
    public static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
