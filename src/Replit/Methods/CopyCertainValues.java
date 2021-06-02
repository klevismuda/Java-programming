package Replit.Methods;


import java.util.*;
/*
Finish the getWithE. Given a String array arr with the following elements
["zero", "one", "two","three","four"]
Create another array fewValues and copy words that have letter e in them
You need to know how many element contain e and create array accordingly
Values in fewValues array need to be ["zero", "one","three"]

Examples:
arr -> ["aa", "be", "lol", "lel", "oreo"]
fewValues -> ["be",  "lel", "oreo"]

arr -> ["e", "hey", "bye", "fury", "spoon"]
fewValues ->["e", "hey", "bye"]
 */

public class CopyCertainValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
       String str = "";
        for (String each : arr) {
            if (each.contains("e")) {
                str += each + " ";

            }
        }
                String[] fewValues = str.split(" ");


                //YOUR CODE ENDS HERE -----------------------

                return fewValues;
            }
        }
