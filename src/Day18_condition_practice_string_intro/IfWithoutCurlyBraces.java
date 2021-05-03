package Day18_condition_practice_string_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
    String todaysClass = "Python";
    if (todaysClass.equals("Java"))
        System.out.println("Java is fun");
      //  System.out.println("It is no Java");
    else
        System.out.println("It is not Java. It is " + todaysClass);

        int score = 1;
        if (score == 1)
            System.out.println("Lowest score: " + score);
        else if (score == 2)
            System.out.println("score is " + score);
         else if (score == 3)
            System.out.println("score is " + score);
         else
            System.out.println("Invalid score ");


        int a = 1;
        if (a == 1)
            System.out.println("a is 1");
            System.out.println("1 is a");


    }
}
