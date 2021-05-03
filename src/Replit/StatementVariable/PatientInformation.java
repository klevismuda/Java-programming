package Replit.StatementVariable;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        String  lastName, firstName, email, street, state, city;
        int age, zipcode;
        double height, weight;
        boolean isMarried=true;
        long workPhoneNumber, personalPhoneNumber;


        // this part is already provided DO NOT CHANGE
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();
        System.out.println("Enter your email");
        email = scan.next();        // IMPORTANT
        scan.nextLine();//    IMPORTANT  to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your city");
        city = scan.next();
        System.out.println("Enter your state");
        state = scan.next();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        System.out.println("Patient personal information");
        System.out.println("Full name: " + lastName + ", " + firstName);
        System.out.println("Address: " + street + ", " + city + ", " + state+ " " + zipcode);
        System.out.println("Contacts: work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);





        // continue for city




    }
}