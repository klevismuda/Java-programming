package OfficeHours.Practice_04_27_2021_Review;

import java.util.Locale;

/*
[Sum of Numbers from String]

Create a method that will accept a String and returns the sum of all the numbers in the String.

Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
	Ex: a5bc12def100g
		Here we would have added 5 + 12 + 100
		NOT: 5 + 1 + 2 + 1 + 0 + 0

 */
public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(getSumFromString("a5bc12def100g"));

    }
    public static int getSumFromString(String str){

        int sum = 0;
        String num = ""; // 5

        for(int i = 0; i < str.length(); i++){

            if(Character.isDigit(str.charAt(i))) { //check if every character is a number (digit)

                num += str.charAt(i); // check if the other if char 12 d

                if(i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))){  // take action if it is not number the next charAt
//i == str.length() - 1 to not come to the last char

                    sum += Integer.parseInt(num);
                    num =""; // reset out String for the number
                }
            }

        }
        return sum;


    }
}
