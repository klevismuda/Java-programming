package Replit.String;
import java.util.Scanner;
/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread
output: jam

input: xxbreadjambreadyy
output: jam

input: xxbreadapple
output: nothing

input: breadbutterbread
output: butter
 */
public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.contains("bread")){
            int indexOfBread = str.indexOf("bread");
            String strTwo = str.substring(indexOfBread+5);
            if(strTwo.contains("bread")) {
                int indexOfBread2 = strTwo.indexOf("bread");
                if(strTwo.substring(0, indexOfBread2).isEmpty()){
                    String strThree = strTwo.substring(indexOfBread2+5);
                    int indexOfBread3 = strThree.indexOf("bread")+13;
                    System.out.println(str.substring(indexOfBread+5, indexOfBread3));
                } else {
                    System.out.println(strTwo.substring(0, indexOfBread2));
                }
                if(strTwo.substring(0, indexOfBread2).isEmpty()){
                    int indexOfBread3 = strTwo.indexOf("bread");
                    System.out.println(str.substring(indexOfBread, indexOfBread3));
                }
            } else {
                System.out.println("nothing");
            }
        } else {
            System.out.println("nothing");
        }
    }
}
