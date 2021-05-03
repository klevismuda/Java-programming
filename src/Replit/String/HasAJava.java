package Replit.String;

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.indexOf("java") == 0 || word.indexOf("java") == 1){
            if(word.contains("java")){
                System.out.println("true");
            } else{
                System.out.println("false");
            }
        } else{
            System.out.println("false");
        }
    }
}
