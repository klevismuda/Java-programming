package Day09_scanner_practice;

import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter price for milk:");
        double priceMilk=scan.nextDouble();
        System.out.print("Enter price for bread:");
        double priceBread=scan.nextDouble();
        System.out.print("Enter price for cucumber:");
        double priceCucumber=scan.nextDouble();
        double totalPrice=priceMilk+priceCucumber+priceBread;
        System.out.println("Total price is: $" + totalPrice);

    }
}
