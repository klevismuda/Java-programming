package Day13_conditional_statement;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 3000.35;

        if (salesAmount <= 2000){
            System.out.println("Good job, you are qualified for bonus!");
            bonus=50;
        }
        else {
            System.out.println("Good job, you are qualified for bonus!");
            bonus=100;
        }
        System.out.println("Your total bonus is $" +bonus);
    }
}
