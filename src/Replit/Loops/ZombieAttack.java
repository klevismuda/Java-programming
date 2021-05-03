package Replit.Loops;
import java.util.Scanner;
/*
A variable inhabitants represents a city and its respective populations. City might have a population of 0 due to a pandemic
zombie disease that is wiping away the human lives. After each day, a city will lose half of its population.
Write a program to loop the city population and make it lose half of its population until population is zero.
Print the each day like below for each day:

Example - inhabitants are 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
 */
public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        String result = "";
        if (inhabitants == 0) {
            System.out.println("--- EXTINCT ---");
        } else {
            while (inhabitants != 0) {
                result = "Day " + day + " [" + inhabitants + "]";
                System.out.println(result);
                day++;
                inhabitants /= 2;
                if (inhabitants == 0) {
                    System.out.println("---- EXTINCT ----");
                }
            }
        }

        /** int numberOfDays = inhabitants;    Tek numri i numberOfDays duhet menduar dicka

        for (int day = 0; day < numberOfDays; day++) {
            System.out.println("Day " + day + " [" + inhabitants + "]");
            inhabitants = inhabitants / 2;
        }
        if (inhabitants < 1) {
            System.out.println("---- EXTINCT ----");

        }
*/
    }
}