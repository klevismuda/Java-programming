package Replit.StatementVariable;
/*
Write a program that will determine the change given from the vending machine.
The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

The given cents value should be more than 0 and less than 100. If the given cents is not in the range print
"Invalid cents amount" and there should be no other output after
In valid cases print the change in this format:
Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
 */
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("Enter cents:");
        Scanner scan = new Scanner(System.in);
        int cents = scan.nextInt();
        int quarters = cents / 25;
        int dimes = (cents -  quarters * 25) / 10;
        int nickels = (cents -  (quarters * 25) - (dimes * 10))  / 5;
        int pennies = (cents -  (quarters * 25) - (dimes * 10) - (nickels * 5));
        if (cents >=0 && cents <=100){
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }

    }
}
/* ANOTHER WAY IS

1 Quaters= 25 cents
   1 Dimes=10 cents
   1 Nickel=5 cents
   1 Penny=1 cent

 vending Machine accept only 1 dollar coins.so 1 DOLLAR=100 cents
import java.util.*;
public class VendingMachine {

    public static void main(String[] args) {
        //
        Scanner input =new Scanner(System.in);
        int amount, quarters, dimes, nickels, pennies,exchange;

        System.out.println("Enter the price of the(from 25 cents to a dollar, in 5-cent increments): ");
        amount=input.nextInt();

        exchange= 100-amount;

        System.out.println("Amout in Return:"+exchange+"cents");

        quarters=exchange/25;
        exchange=exchange%25;

        dimes=exchange/10;
        exchange=exchange%10;

        nickels=exchange/5;
        exchange=exchange%5;

        pennies=exchange;

        System.out.println("Quarters:"+quarters+" Dimes:"+dimes+" Nickels:"+nickels+" Pennies:"+pennies);
    }

}
 */
