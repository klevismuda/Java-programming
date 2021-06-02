package Day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.drink(20);
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.setType("Turkish coffee");  // use the method to change it
        System.out.println("My coffee = " + myCoffee.getType());
        //describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        //ADD another coffee object , set values, call methods
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        // Assign coffee1 to coffee2
        // point coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;

        System.out.println("coffee2 type = " + coffee2.getType());

        coffee2.setType("Espresso");
        System.out.println("coffee2 type = " + coffee2.getType());
        System.out.println("coffee1 type = " + coffee1.getType());
        /**
         * change for both Coffee coffee2 = coffee1;
         */

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        //point to same object as coffee2
        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());



    }
}
