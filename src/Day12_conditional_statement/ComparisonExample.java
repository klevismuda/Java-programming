package Day12_conditional_statement;

public class ComparisonExample {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println(currentSpeed > speedLimit);  //true
        System.out.println(currentSpeed < speedLimit);  //false
        System.out.println(currentSpeed == speedLimit);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding - " + isSpeeding);
        System.out.println("Current speed = " + currentSpeed + "mph");
        System.out.println("Limit speed = " + speedLimit + "mph");

        // current speed 45 + 20 = 65
        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding - " + isSpeeding);
        System.out.println("Current speed = " + currentSpeed + "mph");
        System.out.println("Limit speed = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice));  //true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford? - " + canAfford);

         // accountBalance -= 200;
        // System.out.println("Can I afford? - " + (accountBalance >= itemPrice));  //true

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println(" Is broke? - " + isBroke);





    }
}
