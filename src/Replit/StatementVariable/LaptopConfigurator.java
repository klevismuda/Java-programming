package Replit.StatementVariable;
/*
Write a program that will calculate laptop price based on the components.

First ask user for a screen size.

If screen size is equals to 13.3, add $200 to the laptop price.
If screen size is equals to 15.0 - add $300 to the laptop price.
If screen size is equals to 17.3 - add $400 to the laptop price.
Then ask user for CPU type.

If CPU type equals to i3, add $150 to the laptop price.
If CPU type equals to i5, add $250 to the laptop price.
If CPU type equals to i7, add $350 to the laptop price.
Then ask user for RAM size.

Add $50 for every 4GB of ram to the laptop price.
Then, ask user for storage type and size. There are 2 options: SSD and HDD.

If it's HDD - add $50 to the laptop price for every 500gb.
If it's SSD - add $100 to the laptop price for every 500GB.
Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.

Add $100 if it's FULLHD screen
Add $200 if it's 4K screen.
Example:

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter storage size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter storage size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
Example #2

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter storage size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0
 */
import com.sun.javaws.IconUtil;

import java.util.Scanner;
public class LaptopConfigurator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        System.out.println("Select screen size:");
        double size = scan.nextDouble();
        if (size == 13.3){
            price = price + 200;
        } else if (size == 15.0){
            price = price + 300;
        } else if (size == 17.3 ){
            price = price + 400;
        }

        System.out.println("Select CPU type:");
        String cpu = scan.next();
        if (cpu.equals("i3")) {
            price = price + 150;
        } else if (cpu.equals("i5")) {
            price = price + 250;
        } else if (cpu.equals("i7")) {
            price = price + 350;
        }

        System.out.println("Select RAM size:");
        int ram = scan.nextInt();
        int priceRam = (ram / 4) * 50;
        price = price + priceRam;

        System.out.println("Select storage type:");
        String storage = scan.next();
        if (storage.equals("HDD")){
            System.out.println("Enter storage size:");
            int storageSize = scan.nextInt();
            int priceHDD = (storageSize / 500) * 50;
            price = price + priceHDD;
        } else if (storage.equals("SSD")){
            System.out.println("Enter storage size:");
            int storageSize = scan.nextInt();
            int priceSSD = (storageSize / 500) * 100;
            price = price + priceSSD;
        }

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        if (resolution.equals("FULLHD")) {
            price = price + 100;
        } else if (resolution.equals("4K")) {
            price = price + 200;
        }

        System.out.println("Laptop price is: $" + price);

    }
}
