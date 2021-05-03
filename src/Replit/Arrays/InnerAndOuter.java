package Replit.Arrays;
import java.util.*;
/*
Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.
Examples:
input (outer): 1, 2, 4, 6
input (inner): 2, 4
output: true

input (outer): 1, 2, 4
input (inner): 6, 5
output: false
 */
public class InnerAndOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for(int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for(int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        boolean isSame = false;
        for(int i=0; i<inner.length;i++){

            if(Arrays.binarySearch(outer, inner[i])>0){
                isSame = true;
            }
        } System.out.print(isSame);






//        String trueStatement = "";
////        if(outer.length != (inner.length + 2)){
////            System.out.println("false");
////        }
//        for(int j = 1; j < outer.length - 1; j++) {
//
//            trueStatement += outer[j] + " ";
//        }
//            String[] newArray = trueStatement.split(" ");
//            if(Arrays.toString(inner) == Arrays.toString(newArray)){
//                System.out.println("true");
//            } else {
//                System.out.println("false");
//            }
        }

    }

