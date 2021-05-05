package Replit.ArrayList;
import java.util.*;
/*
We will be manipulating elements of an ArrayList by using List methods.
The first List method we will learn is .add()
The following code will take an ArrayList of Strings called strs and add "Hello" to it.

strs.add("Hello");
The syntax is:
arraylistvariable.add(data_to_add);
Add three names (any names) to the ArrayList called names.
 */
public class Add {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Hello");
        names.add("Klevis");
        names.add("Muda");

        System.out.println(names.size());
    }
}
