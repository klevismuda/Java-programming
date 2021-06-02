package Replit.Methods;
import java.util.*;
/*
Complete the void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */
public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        for (int i = 0; i < words.length; i++){
            boolean isWordUnique = true;
            for (int j = 0; j < words.length; j++){
                if(i != j && words[i].equals(words[j])){
                    isWordUnique = false;
                    break;
                }
            }
            if(isWordUnique){
                System.out.println(words[i]);
            }
        }

    }
}
