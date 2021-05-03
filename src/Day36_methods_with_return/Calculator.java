package Day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add = " + add(5.4, 7.2));
        double sum = add(3,2);
        System.out.println("Sum is " + sum);
        System.out.println("divide(8.4, 2.2) = " + divide(8.4, 2.2));
        System.out.println("multiply(2.4, 9.3) = " + multiply(2.4, 9.3));
        System.out.println("minus(9.2, 2.3) = " + minus(9.2, 2.3));
    }
    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }
    public static double divide(double a,double b) {

        return a/b;
    }

    public static double multiply(double a, double b) {

        return a*b;
    }

    static double minus(double a, double b) {

        return a-b;
    }
}
