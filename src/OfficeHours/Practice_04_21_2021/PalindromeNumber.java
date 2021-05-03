package OfficeHours.Practice_04_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {
        //System.out.println(112 % 1); //0
        //System.out.println(112 % 10); //2  last integer
        //System.out.println(112 % 100); // 12

        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;
        while (temp != 0){
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
            //System.out.println(reverse);
        }
        return reverse == number;
    }
}

//System.out.println("Last digit " + number % 10);
//        number /= 10;
//        System.out.println("number after / 10  " + number);
//        System.out.println();
