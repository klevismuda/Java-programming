package Replit.Methods;
/*
Create a method called cube. It is a void method with no arguments.
Write all required code inside this method in order to read a number from the console
and then prints the cubed value of that number:

Example:
input: 5
output: 125
 */
import java.util.*;
public class FindCube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        cube(n);
    }
    public static void cube(int n){
        n = n*n*n;
        System.out.println(n);
    }

}
