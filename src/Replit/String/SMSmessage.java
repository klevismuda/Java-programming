package Replit.String;
import java.util.*;
/*
Given a String message in the following format:
Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
assign the value of the sender, phoneNumber, and messageBody variables and print them.

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */
public class SMSmessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sender = scan.nextLine();
        String phoneNumber= scan.nextLine();
        String messageBody = scan.nextLine();
        System.out.println("Sender: " + sender.substring(1, sender.length() -1));
        System.out.println("Phone Number: " + phoneNumber.substring(1, phoneNumber.length() -1));
        System.out.println("Message body: " + messageBody.substring(1, messageBody.length() -1));
    }
}
