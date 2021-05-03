package Saim_Practices.Arrays;

public class MinAndMaxFromArray {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,18,5,6};
        int max = arr[0];
        int min = arr[0];
        for(int each : arr){
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("Max is " + max + ", min is " + min);
    }
}
