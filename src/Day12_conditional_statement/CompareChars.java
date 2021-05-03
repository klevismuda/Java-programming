package Day12_conditional_statement;

import java.sql.SQLOutput;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'B';
        System.out.println(letter1 == letter2 );
        System.out.println(letter1 > letter2 );
        System.out.println(letter1 < letter2 );

        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);

    }
}
