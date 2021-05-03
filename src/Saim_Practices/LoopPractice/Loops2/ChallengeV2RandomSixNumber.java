package Saim_Practices.LoopPractice.Loops2;

import java.util.Random;

/*
Generate a random number that is six digits long. Each digit in this number should be unique,
meaning the number 6 digit number should have 6 different character numbers that make it up.
Print the number.
HINTS: Loops, Strings, Random
 */
public class ChallengeV2RandomSixNumber {
    public static void main(String[] args) {
        Random ram = new Random();
        String randomSix = "";
        while (randomSix.length() <= 6) {
            int index = ram.nextInt(10);
            String numString = index + "";
            if (!randomSix.contains(numString)) {
                randomSix += "" + numString;
            } else if (randomSix.length() == 6) {
                break;

            }
        }
        System.out.println(randomSix);


    }
}
