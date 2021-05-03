package Day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] differentName) {   // we can change from args to another name
        System.out.println("Hello from real main method");
        main(2, 4);
        System.out.println(Arrays.toString(differentName));   // [one, two, three]
    }

    /**
     * overloading main method:
     * same name + different parameter
     * JDK does not look for this ose to run
     * @param num1
     * @param num2
     */

    public static void main (int num1, int num2){
        System.out.println("sum(int , int )");
        System.out.println("Result = " + (num1 + num2));
    }

}
