package Day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args) {
        System.out.println(10 / 3); //3
        System.out.println(5 / 2);  //2
        short num1 = 13 - 9 / 3 * 10;
        int num2 = 15;
        //num1 += -10 ;
        System.out.println(num1 ); //2

        System.out.println(5.0 / 2.0);
        System.out.println(5.0 / 2);

        double d1 = 12.0;
        double d2 = 5.0;
        System.out.println(d1 / d2); //2.4

        int count = 100;
        double dCount = 30.0;
        System.out.println(count / dCount);

    }
}
