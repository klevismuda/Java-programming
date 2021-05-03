package OfficeHours.Practice_04_27_2021_Review;
/*
User is given two Strings, which could vary in length, merge these Strings so these Strings are combined into
one String. Any extra characters from mismatched length String are at the end.
Ex:String one = abc
String two = defgh
Output:adbecfgh

Ex:String one = java
String two = is
Output:jiasva
 */
public class MergeStrings {
    public static void main(String[] args) {
        String one = "abctkle";
        String two = "defgh";
        String result = "";

        for (int i = 0; i < one.length() || i< two.length(); i++) {
            if(one.length()>i){
                result+=one.charAt(i);
            }
            if(two.length()>i){
                result+=two.charAt(i);
            }
        }
        System.out.println(result);
    }
}
  // Another way
//  String one = "abcs";
//    String two = "efghijk";
//    int length = 0;
//    String result = "";
//        if (one.length() >= two.length()) {
//                length = one.length();
//                } else {
//                length = two.length();
//                }
//                for (int i = 0; i < two.length(); i++) {
//        if(one.length()>i){
//        result+=one.charAt(i);
//        }
//        if(two.length()>i){
//        result+=two.charAt(i);
//        }
//        }
//        System.out.println(result);
//        }