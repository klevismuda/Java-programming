package Replit.Arrays;
import java.util.*;
public class Quiz {
    public static void main(String[] args) {


    int [] a = new int [3];
    int [] b = {1,2,3,4};
    a =b;
    for ( int i = 0; i < a.length; i++){
        System.out.println(a[i]);
    }

    char [] array = {'D', 'C', 'B', 'A'};
    Arrays.sort(array);
    for(char each : array){
        System.out.print(each + " ");
        if(each == 'D'){
            continue;
        }
    }


}}
