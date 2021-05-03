package Day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();
        /**
         * OR we can do at
         * if(start > end){
         *                 System.out.println("Reverse numbering is not supported");
         *             }
         */

        for( int i = start; i < end; i++)
            System.out.print(i + " ");
            if(start > end){
                System.out.println("Reverse numbering is not supported");
            }
    }
}
