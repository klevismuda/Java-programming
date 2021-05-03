package Day21_String_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("world = " + word);

        word = word.replace("hub","lab");
        System.out.println("word = " + word);

        //gitlab
        //i->o  a->i --> gotlib
        System.out.println(word.replace('i','o').replace('a','i'));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ","");
        System.out.println("sentence = " + withNoSpace);

        sentence = sentence.replace("java","selenium")
                           .replace("fun","a lot of fun");  // this is easy to read
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ","")
                        .replace(" results for java book","");
        System.out.println("result = " + result);


    }
}
