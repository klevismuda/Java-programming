package Saim_Practices.Arrays;
/*
Even and odd ArraysGiven an array with values: 1,2,-3,4,-34,55,78,90,33,10
-Take our all the even numbers from the array and put them into a new array. Print the new array
-Take our all the odd numbers from the array and put them into a new array. Print the new array
 */
public class EvenAndAddArrays {
    public static void main(String[] args) {
        int[] ArraysGiven = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        System.out.println("Even numbers");
        for (int i = 0; i < ArraysGiven.length; i++) {
            if (ArraysGiven[i] % 2 == 0) {
                System.out.print(ArraysGiven[i] + " ");
            }
        }
        System.out.println("\nOdd numbers");
        int[] ArraysGiven1 = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        for (int i = 0; i < ArraysGiven1.length; i++) {
            if (ArraysGiven1[i] % 2 == 1) {
                System.out.print(ArraysGiven1[i] + " ");
            }
        }

    }
}
