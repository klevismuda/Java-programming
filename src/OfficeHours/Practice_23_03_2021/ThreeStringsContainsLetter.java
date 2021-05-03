package OfficeHours.Practice_23_03_2021;
/*
Given three String variables of some text find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
 */
public class ThreeStringsContainsLetter {
    public static void main(String[] args) {
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apple";
        String biggestWordWithA = "";

        if(wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()){
            biggestWordWithA = wordOne;
        }

        if(wordTwo.contains("a") && wordTwo.length() > biggestWordWithA.length()){
            biggestWordWithA = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > biggestWordWithA.length()){
            biggestWordWithA = wordThree;
        }

        if(biggestWordWithA.isEmpty()){
            System.out.println("No words contains A");
        } else {
            System.out.println("Longest word that contains \"a\" is " + biggestWordWithA );
        }

    }
}
