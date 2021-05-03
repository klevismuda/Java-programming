package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

/*
Count Letters (Similar to Target word, but different layer)
Given an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
Ex:
Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”
letter: ‘a’
Output:6
 */
public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css","java", "javascript", "selenium"));

        char targetLetter = 'a';
        int count = 0;

//        for(String each : words){
//            for(int i = 0; i < each.length(); i++){
//                if(each.charAt(i) == targetLetter){
//                    count++;
//                }
//            }
//        }
        for(String each : words){
            count += letterInWord(each, targetLetter);
        }

        System.out.println(targetLetter + " was found " + count + " times");

    }
//    public static int letterInWord(String each, char target){
//        int count = 0;
//        for(int i = 0; i < each.length(); i++){
//                if(each.charAt(i) == target){
//                    count++;
//                }
//            }
//        return count;

    public static int letterInWord(String word, char target) {
        int count = 0;
        for(char each : word.toCharArray()){
            if(each == target) count++;
        }
        return count;
    }
}

// there are three ways to do it. These are the same, some with method.
