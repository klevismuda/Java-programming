package Replit.Arrays;
import java.util.*;
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.
Example:
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:
email -> hello-gmail.com
Output:
invalid email

email -> my@fancy@email.com
Output:
invalid email
 */
public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String[] mailArray = email.split("@");
        if(mailArray.length == 1 || mailArray.length >= 3){
            System.out.println("invalid email");
        }
        if(mailArray.length == 2){
            System.out.println("Email id: " + mailArray[0]);
            System.out.println("Email domain: " + mailArray[1]);
        }
    }
}
