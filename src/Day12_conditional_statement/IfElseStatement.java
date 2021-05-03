package Day12_conditional_statement;

public class IfElseStatement {
    public static void main(String[] args) {
        int count = 25;
        if (count >= 25) {
            System.out.println("condition is true");
        } else {
            System.out.println(" count is less than 25");
        }

        byte age = 17;
        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");

        } else {
            System.out.println("not eligible to vote");
            System.out.println("Age is less than 18");
        }
    }
}