package Day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT
        int num1 = 10;
        // ++num1
        int num2 = ++num1;
        System.out.println(num1);  //5
        System.out.println(num2);  //5

        //POST-INCREMENT
        int number1 = 4;
        int number2 = number1++;
        // number1++
        System.out.println(number1);  //5
        System.out.println(number2);  //4

        int apples = 5;
        int basket = ++apples;
        System.out.println("Apples = " + apples); //6
        System.out.println("Basket = " + basket); //6

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + apples); //16
        System.out.println("kiwiBasket = " + kiwiBasket); //15

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a is " + a); //51
        System.out.println("b is " + b); //23
        System.out.println("c is " + c); //50+23=73



    }
}
