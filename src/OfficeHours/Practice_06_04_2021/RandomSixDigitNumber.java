package OfficeHours.Practice_06_04_2021;

import java.util.Random;

/*
Generate a random number that is six digits long. Each digit in this number should be unique,
meaning the number 6 digit number should have 6 different character numbers that make it up.
Print the number.
HINTS: Loops, Strings, Random
 */
public class RandomSixDigitNumber {
    public static void main(String[] args) {
        Random random = new Random();

        String randomNumber = "";
        //  System.out.println(random.nextInt(10)); // 0 - 9
        while(randomNumber.length() != 6){
            int eachRandom = random.nextInt(10);
            if(!randomNumber.contains("" + eachRandom)){
                randomNumber += eachRandom;
            }
        }
        System.out.println("Random number: " + randomNumber);

    }
}
