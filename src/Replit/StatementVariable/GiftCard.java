package Replit.StatementVariable;
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items
Blanket - 60$
Charger - 25$
Hat - 25$
Headphones - 30$
Laptop - 200$
Pants - 50$
Pillow - 40$
Smartphone - 1000$
Socks - 5$
USB cable - 10$

Hint: if/ else if / else

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!
 */

import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gift = scan.nextLine();
        int balance = 100;
        if (gift.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 60;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (gift.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 25;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (gift.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 25;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (gift.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 30;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (gift.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (gift.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 50;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (gift.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 40;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (gift.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (gift.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 5;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (gift.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 10;
            System.out.println("Your current balance is: " + balance + "$");
        } else {
            System.out.println("Invalid item!");
        }
    }
}
