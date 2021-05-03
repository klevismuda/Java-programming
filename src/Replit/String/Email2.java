package Replit.String;

import java.util.Scanner;

/*import java.util.Scanner;
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

        Example:

        Input: craig_federighi@apple.com
Input: craig_federighi@apple.com
Output:
        First name: Craig
        Last name: Federighi
        Domain: apple

 */
public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfPoint = email.indexOf(".");
        String firsName = email.substring(0, indexOf_);
        String lastName = email.substring(indexOf_ + 1, indexOfAt);


        System.out.println("First name: " + firsName.substring(0,1).toUpperCase() + firsName.substring(1));
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase() + lastName.substring(1));
        System.out.println("Domain: " + email.substring(indexOfAt + 1, indexOfPoint));
    }
}
