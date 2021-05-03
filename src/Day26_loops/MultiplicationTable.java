package Day26_loops;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        /**
         * if number less than 1 or more than 10
         * print "Error: Invalid input"
         * exit main method: return
         */
        if(num <= 0 || num >10){
            System.out.println("Error: Invalid input");
            return; // exit main method/Stop the program
        }

        for (int i = 1; i <= 10; i++){
                System.out.println(num + " x " + i + " = " + num*i);
            }

//        for (int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 10; j++){
//                System.out.print(i + " X " + j + " = " + (j*i) + "\t");
//            }
//            System.out.println("");
//        }


        }
        }


