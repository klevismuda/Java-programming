package Day29_nestedLopp_arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[]args){
        String[] cities = {"Elbasan", "New York", "Washington", "Baku", "Vienna"};
        System.out.println(Arrays.toString(cities));

        int[] numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 7;
        System.out.println("Value at index 0 = " + numbers[0]);
        System.out.println("Value at index 1 = " + numbers[1]);
        System.out.println("Value at index 2 = " + numbers[2]);

        int i = 0;
        System.out.println(numbers[i]); //5
        i++;
        System.out.println(numbers[i]); //7

        System.out.println("Number of elements " + numbers.length);

        int len = numbers.length;
        System.out.println("len = " + len);

        numbers[1] = 21;
        numbers[2] = 212;
        System.out.println(Arrays.toString(numbers));
    }
}
