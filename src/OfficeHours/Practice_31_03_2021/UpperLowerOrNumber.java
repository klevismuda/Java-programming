package OfficeHours.Practice_31_03_2021;
/*
Count upper, lower, and numbersGiven a String, find and print how many uppercase letter, lowercase letter,
and number are in the String.
Ex:Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5numbers
 */
public class UpperLowerOrNumber {
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4";
        int upperCase = 0, lowerCase = 0, number = 0;

        for(int i = 0; i < str.length(); i++){
            char eachLetter = str.charAt(i);

            if(eachLetter >= 'a' && eachLetter <= 'z'){
                lowerCase++;
            } else if(eachLetter >= 'A' && eachLetter <= 'Z'){
                upperCase++;
            } else if (eachLetter >= '1' && eachLetter <= '9'){
                number++;
            }
        }
        System.out.println(upperCase + " uppercase letters\n" + lowerCase + " lowercase letters\n" + number + " numbers");
    }
}
