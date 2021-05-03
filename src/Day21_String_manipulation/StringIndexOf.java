package Day21_String_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "java";
        System.out.println("The index of j is: " + word.indexOf("j")); //0
        System.out.println("The index of a is: " + word.indexOf("a")); //1 only 1st a
        System.out.println("The index of va is: " + word.indexOf("va")); // 2
        System.out.println("The index of github is: " + word.indexOf("github")); // -1 when it is not found

        String word2 = "github project";
        System.out.println(word2.indexOf("t")); //2

    }
}
