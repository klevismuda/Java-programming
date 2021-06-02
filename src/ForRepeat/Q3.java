package ForRepeat;

import Day41_arraylist.ArrayAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static String method9(String one, String two, String three) {
        return "" + middle(one) + middle(two) + middle(three);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = method9(scan.next(), scan.next(),scan.next());
        System.out.print(str);

//    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 8, -42, 2, 10));
//    ArrayList<Integer> nums2 = new ArrayList<>();
//
//    for(int each : nums){
//        switch (each){
//            case 1:
//                nums2.add(1);
//            case 5:
//                nums2.add(50);
//                break;
//            case 4:
//
//                break;
//            case 8:
//                nums2.remove(0);
//                break;
//            case 10:
//            case -42:
//                nums2.add(1, 0);
//                break;
//            case 55:
//                nums2.add(105);
//                break;
//            case 2:
//                nums2.add(20_000);
//                break;
//            default:
//                nums2.add(null);
//        }
//        System.out.println(nums2);
//    }



}

    public static char middle (String s){
        return s.charAt(s.length()/2);
    }
 }
