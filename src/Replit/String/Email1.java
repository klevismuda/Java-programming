package Replit.String;
import java.util.Scanner;
/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com

input: barakobama@gmail.com

output: barakobama@gmail.com
 */
public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        if(email.contains("_")){
            System.out.println(email.substring(indexOf_+ 1, indexOfAt) + "_" + email.substring(0, indexOf_) + email.substring(indexOfAt));
        } else {
            System.out.println(email);
        }

    }
}
