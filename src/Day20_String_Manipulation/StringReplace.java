package Day20_String_Manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String sentence = "java Strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a","u"));
        System.out.println(sentence.replace("Strings","conditions"));
        System.out.println(sentence.replace("java",""));
    }
}
