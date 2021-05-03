package Day25_loops;

import java.sql.SQLOutput;

public class PrintStars {
    public static void main(String[] args) {
        for(int i = 0; i < 15; i++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "";
        for (int i = 1; i <= 5; i++){
            myStars += "* ";
        }
        System.out.println("My stars = " + myStars.trim());
    }
}
