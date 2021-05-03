package Saim_Practices.LoopPractice.Loops2;
/*
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
Ex:Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5 numbers
 */
public class CountUpperLowerNumbers {
    public static void main(String[] args) {
        String input = "2juMp41EEkd4s4";
        int uppercase = 0, lowercase = 0, numbers = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
                uppercase++;
            }
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
                lowercase++;
            }
            if(input.charAt(i) >= '0' && input.charAt(i) <= '9'){
                numbers++;
            }
        }
        System.out.println(uppercase + " uppercase letters");
        System.out.println(lowercase + " lowercase letters");
        System.out.println(numbers + " numbers");
    }
}
