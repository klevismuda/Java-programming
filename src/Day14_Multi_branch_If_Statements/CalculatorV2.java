package Day14_Multi_branch_If_Statements;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Select an operator +, -, *, /");
        char operator = scan.next().charAt(0);
        if (operator == '+'){
            System.out.println(num1 + num2);
        }
        else if (operator == '-'){
            System.out.println(num1 - num2);
        }
        else if (operator == '*'){
            System.out.println(num1 * num2);
        }
        else if (operator == '/'){
            System.out.println(num1 /num2);
        }
        else{
            System.out.println("not a valid operator");
        }

    }
}
