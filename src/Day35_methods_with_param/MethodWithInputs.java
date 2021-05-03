package Day35_methods_with_param;

import java.util.Scanner;

public class MethodWithInputs {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        displayValue(scan.nextInt());
        displayValue(14);
        int count = 41;
        displayValue(count);
        displayString("klevis");
        greetByName("Rejan");
        greetByName("Nadir");
        String name = "Aiden";
        greetByName(name);
    }
    public static void displayValue (int num){

        System.out.println("value is " + num);
    }
    public static void displayString (String name){

        System.out.println("name is " + name);
    }
    public static void greetByName(String name){

        System.out.println("hello " + name + ", how are you today!");
    }
}
