package Saim_Practices.LoopPractice.Loops3;
/*
Given a String book with all the text of your book. Figure out how much you will make from your book.
Each chapter you have in your book will add 10 $ value to your book.
Go through your book and figure out the value of the book. Ignore case sensitivity.
Check the next slide for the Book text you can use to test.
 */

import java.util.Scanner;

public class BookValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a text");
        String text = scan.nextLine();
        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length() - 6; i++) {
            if (text.substring(i, i + 7).equals("chapter")) {
                count++;
            }
        }
        System.out.println("Price of the book is $" + count * 10);
    }
}
