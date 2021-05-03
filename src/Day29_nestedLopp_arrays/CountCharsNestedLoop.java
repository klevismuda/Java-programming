package Day29_nestedLopp_arrays;
/*
String word = "java"

1) find duplicates and count
2) find unique characters(appearing only once)
3) print character and number of occurences
 */
public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";

        for (int outer = 0; outer <word.length(); outer ++){
        char outerChar = word.charAt(outer);
        int count = 0;

        for (int inner = 0; inner < word.length(); inner++){
            char innerChar = word.charAt(inner);
            if (outerChar == innerChar){
                count++;
            }

        }


        System.out.println(outerChar + " = " + count);
    }


    }
}
