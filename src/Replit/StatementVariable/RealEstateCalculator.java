
/*
This program should work with 3 house types:

Condo, Townhouse and Single Family Home.

Starting price for Condo = 50000,
for Townhouse = 75000,
Single Family Home = 95000.

Based on number of bedroom:

add 30000 for every bedroom

Then you need to ask if property has backyard.

Add 5000 to the property price if it's true.
Backyard shouldn't be available for Condo, so display message "Backyard is not available for condo!", (don't increase property price!), in case someone would try to select backyard for condo.

Then ask user if there is a garage or not.

If the property has garage, add 20000 to the property price for every spot. If amount of garage spots exceeds 10 spots (greater then 10), display message: "Pardon, it's not public parking!" and don't increase property price.

Then, ask user for metro accessibility.

If metro is closer than 1 mile (inclusive), add 10000to the property price. If metro is in the radius from 1 mile to 3 miles, add to the property price 5000.

Then, ask user for highway accessibility.

If highway is closer than 1 mile (inclusive), add 15000 to the property price. If highway is in the radius from 1 to 5 miles, add 8000 to the property price. And if highway is in the radius from 5 mile to 20 miles (inclusive), add 4000 to the property price.

Then your program should ask about nearest school rating.

If school's rating is in the range from 10 (inclusive) to 8 points, add 45000 to the property price. If school's rating is less than 8 points and more or equals to 4 points, add 20000 to the property price. Otherwise, add 5000 to the property price.

Then, ask user if any of the family members smoke. If so, reduce property price by 5000.

At the end, display message: "Market report has been generated.", and display underneath: "Your estimate market price is: propertyPrice$"

Given:

-int propertyPrice = 0;
-int numberOfBedrooms, garageSpots;
-float metroAccessibility, schoolScore, highwayAccessibility;
-boolean backyard, smoking, garage;
Given:

-int propertyPrice = 0;
-int numberOfBedrooms, garageSpots;
-float metroAccessibility, schoolScore, highwayAccessibility;
-boolean backyard, smoking, garage;
Example 1
Welcome to the RealEstate calculator!
Enter your property type:
Condo

How many bedrooms do you have?
3

Do you have a backyard?
true
Backyard is not available for condo!

Do you have garage?
true
How many spots?
2

How close is metro station?
0.5

How close is highway?
1.5

What's the rating of nearest school?
9

Does any of your family members smoke?
true

Market report has been generated.
Your estimate market price is: 238000$
Example 1
Welcome to the RealEstate calculator!
Enter your property type:
Condo

How many bedrooms do you have?
3

Do you have a backyard?
true
Backyard is not available for condo!

Do you have garage?
true
How many spots?
2

How close is metro station?
0.5

How close is highway?
1.5

What's the rating of nearest school?
9

Does any of your family members smoke?
true

Market report has been generated.
Your estimate market price is: 238000$
Example 2:

Welcome to the RealEstate calculator! *
Enter your property type:
Single Family Home

How many bedrooms do you have?
10

Do you have a backyard?
true

Do you have garage?
true
How many spots?
11
Pardon, it's not a public parking!

How close is metro station?
1

How close is highway?
1

What's the rating of nearest school?
1

Does any of your family members smoking?
false

Market report has been generated.
Your estimate market price is: 430000$
 */
package Replit.StatementVariable;
import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if (houseType.equals("Condo")) {
            propertyPrice = propertyPrice + 50_000;
        } else if (houseType.equals("Townhouse")) {
            propertyPrice = propertyPrice + 75_000;
        } else if (houseType.equals("Single Family Home")) {
            propertyPrice = propertyPrice + 95_000;
        }


        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice = propertyPrice + numberOfBedrooms * 30_000;


        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (backyard == true && houseType.equals("Condo")) {
            System.out.println("Backyard is not available for condo!");
            propertyPrice = propertyPrice;
        } else if (backyard == true && ((houseType.equals("Townhouse")) || (houseType.equals("Single Family Home")))) {
            propertyPrice = propertyPrice + 5_000;
        } else {
            propertyPrice = propertyPrice;
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if (garage == true) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots <= 10) {
                propertyPrice = propertyPrice + garageSpots * 20_000;
            } else {
                System.out.println("Pardon, it's not a public parking!");
                propertyPrice = propertyPrice;
            }
        } else {
            propertyPrice = propertyPrice;
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1){
            propertyPrice = propertyPrice + 10_000;
        } else if (metroAccessibility > 1 && metroAccessibility <3){
            propertyPrice = propertyPrice + 5_000;
        } else {
            propertyPrice = propertyPrice;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <=1) {
            propertyPrice = propertyPrice + 15_000;
        } else if (highwayAccessibility > 1 && highwayAccessibility <5) {
            propertyPrice = propertyPrice + 8_000;
        } else if (highwayAccessibility >= 5 && highwayAccessibility <=20) {
            propertyPrice = propertyPrice + 4_000;
        } else {
            propertyPrice = propertyPrice;
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if (schoolScore <=10 && schoolScore >=8) {
            propertyPrice = propertyPrice + 45_000 ;
        } else if (schoolScore <8 && schoolScore >4) {
            propertyPrice = propertyPrice + 20_000;
        } else {
            propertyPrice = propertyPrice + 5_000;
        }

        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if (smoking == true){
            propertyPrice = propertyPrice - 5_000;
        } else {
            propertyPrice = propertyPrice;
        }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");
    }
}
