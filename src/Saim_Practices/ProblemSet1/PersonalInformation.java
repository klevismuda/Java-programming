package Saim_Practices.ProblemSet1;
/*
Ask the user how many people they live with?
if user lives with Less than 2 people: print "Live with less than 2 people"
if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
if the user lives with more than 6 people: print "Live with "more than 6 people"
Ask the user what city they live in?
Ask the user if the live in downtown ("yes or no")
if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
if they have thought about it print "do it its great", if they have not print "You should think about it"
Ask the user their favorite animal?
Print "Wow %animal is a great animal"
Ask the user how many pets they want?
Print "Interesting, do you want %numberOfPets %favoriteAnimals?"
 */
import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int peopleLive = scan.nextInt();;
        if(peopleLive <= 2){
            System.out.println("Live with less than 2 people");
        } else if(peopleLive >= 3 && peopleLive <= 6){
            System.out.println("Live with 3 - 6 people");
        } else if(peopleLive > 6){
            System.out.println("Live with more than 6 people");
        }

        System.out.println("What city they live in?");
        String city = scan.nextLine();
        scan.nextLine();
        System.out.println("You live in " + city);
        System.out.println("Are living in downtown? (yes or no)");
        boolean downtown = scan.nextBoolean();
        if(downtown == true){
            System.out.println("Have you thought about moving to the suburbs? (yes or no)");
            boolean suburbs = scan.nextBoolean();
            if (suburbs == true){
                System.out.println("Do it its great");
            } else {
                System.out.println("You should think about it");
            }
        }

        System.out.println("What is your favourite animal?");
        String favouriteAnimal = scan.next();
        scan.nextLine();
        System.out.println("Wow " + favouriteAnimal + " is a great animal");

        System.out.println("How many pets they want?");
        int petsNum = scan.nextInt();
        System.out.println("Interesting, do you want " + petsNum + " " + favouriteAnimal);
    }
}
