package Replit.ArrayList;
import java.util.*;
/*
Create a static method that:
is called repeatAll
returns ArrayList of Booleans
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is
(true, false, false)

The modified ArrayList should be
(true, false, false, true, false, false)
 */
public class RepeatAll {
    public static ArrayList<Boolean> repeatAll(List<Boolean> booleans){
        ArrayList<Boolean> newList = new ArrayList<>();

        for (int j = 0; j < 2; j++) {    // Use nested loop to repeat the same thing
            for (boolean each : booleans) {
                 newList.add(each);
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }
}
