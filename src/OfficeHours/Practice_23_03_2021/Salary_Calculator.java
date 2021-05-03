package OfficeHours.Practice_23_03_2021;
/*
Given the following information: hourly rate, weekly hours, and number of weeks. Check if all the inputs are valid and then calculate the salary.
- hourly rate cannot be negative or zero
-> If invalid print: Hourly Rate cannot be Negative or Zero
- weekly hours cannot be zero, negative or more than 65
-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
- number of weeks cannot be less than 1 and more than 52
-> If invalid print: Number of weeks cannot be less than 1 or greater than 52
Equation: salary = hourly rate * weekly hours * number of weeks
 */
public class Salary_Calculator {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHour = 40;
        int numberOfWeeks = 52;

        boolean hourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHourAreValid = weeklyHour > 0 && weeklyHour <=65;
        boolean numberOfWeeksAreValid =  numberOfWeeks > 0 && numberOfWeeks <= 52;

        if(hourlyRateIsValid){
            if(weeklyHourAreValid){
                if(numberOfWeeksAreValid){
                    System.out.println("Salary is: " + (hourlyRate * weeklyHour * numberOfWeeks));
                } else {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }
            } else {
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            }
        } else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }
// We have another way to do it    // Option 2
        if(hourlyRateIsValid && weeklyHourAreValid && numberOfWeeksAreValid){
            System.out.println("Salary is: " + (hourlyRate * weeklyHour * numberOfWeeks));
        } else {
            if(!hourlyRateIsValid){
                System.out.println("Hourly Rate cannot be Negative or Zero");
            } else if(!weeklyHourAreValid){
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            } else {
                System.out.println("Number of weeks cannot be less than 1 or greater than 52");
            }
        }
    }
}
