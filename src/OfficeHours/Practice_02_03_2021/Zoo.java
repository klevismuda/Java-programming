package OfficeHours.Practice_02_03_2021;
/*
Make a class Zoo
make a main method
Create variables and give some values
	- For this one, pick which datatype you think is best for each variable
	- name, founded date, starting time, closing time, open on holidays, has aquarium section, number of big cats, number of hoofed animals, number of reptiles, number of birds, number of primates, number of employees, ticket cost for adults, ticket cost for under 13, park rules,
	- Make a brochure of the zoo's information.
 */
public class Zoo {
    public static void main(String[] args) {
        String name = "Brookfield Zoo", foundedDate = "March 3, 2021", startTime = "7:00 AM", closingTime = "5:00 PM";
        boolean isOpenOnHolidays = true, hasAquarium = false;
        int numberOfBigCats = 10, numberOfHoofedAnimals = 15, numberOfReptiles = 20, numberOfBirds = 20, numberOfPrimates = 10, numberOfEmployees = 50;
        double ticketCostForAdults = 13.99, ticketCostForUnder13 = 9.99;
        String parkRules = "No eating or drinking outside of designated areas\n" + "No flash photography\nNo Feeding the animals\nNo extensive perfumes";


        System.out.println("\t\tCome to " + name + "!");
        System.out.println("We were founded on " + foundedDate);
        System.out.println("Our operating hours are from " + startTime + " to " + closingTime);
        System.out.println("We are open on holidays: " + isOpenOnHolidays);
        System.out.println("We have an Aquarium: " + hasAquarium);
        System.out.println("\n\t\tFEATURED ANIMALS:");
        System.out.println("Number of Big Cats: " + numberOfBigCats);
        System.out.println("Number of Hoofed Animals: " + numberOfHoofedAnimals);
        System.out.println("Number of Reptiles: " + numberOfReptiles);
        System.out.println("Number of Birds: " + numberOfBirds);
        System.out.println("Number of Primates: " + numberOfPrimates);
        System.out.println("\nAll of our animals are taken care of by our " + numberOfEmployees + " dedicated Employees");
        System.out.println("\n\t\tOUR PRICES:");
        System.out.println("Price for adults: $" + ticketCostForAdults);
        System.out.println("Price for anyone under 13: $" + ticketCostForUnder13);
        System.out.println("\n\t\tOUR RULES:\n" + parkRules);
    }
}
