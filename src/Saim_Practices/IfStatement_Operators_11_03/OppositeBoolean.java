package Saim_Practices.IfStatement_Operators_11_03;
/*
[If statement, operators]

Write a program that will accept a boolean value. Print out the opposite of the given boolean

Ex: true -> false
    false -> true

 */
import java.util.Scanner;
public class OppositeBoolean {
    public static void main(String[] args) {
        System.out.println("Write true or false");
        Scanner scan = new Scanner(System.in);
        boolean opposite = scan.nextBoolean();

        if (opposite == true){
            System.out.println(opposite + " > false");
        }
        else if  (opposite == false){
            System.out.println(opposite + " >true");
        }
        else {
            System.out.println("Error input");
        }
    }
}
