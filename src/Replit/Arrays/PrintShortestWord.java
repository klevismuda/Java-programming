package Replit.Arrays;
/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
 */
import java.util.*;
public class PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String [] strArray = str.split(", ");
        String shortestWord = strArray[0];
        String words = "";
        for(int i = 0; i < strArray.length; i++){
            if(shortestWord.length() >= strArray[i].length()){
                shortestWord = strArray[i];
            }
        }
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() == shortestWord.length()) {
                words += strArray[i] + " ";
            }
        }
        String[] shortWords = words.split(" ");
        Arrays.sort(shortWords);
        System.out.println(Arrays.toString(shortWords));
    }

}
