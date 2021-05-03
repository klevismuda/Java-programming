package Day14_Multi_branch_If_Statements;

public class CalculatorV1 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 5;
        char operator = '/';
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
