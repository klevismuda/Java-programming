package Day17_ternary_nested_conditions;

public class TernaryExample {
    public static void main(String[] args) {
        int score1 = 70;
       /* String result1;

            if (score1 > 60){
                result1 = "Pass";
            } else {
                result1 = "Fail";
            }
        System.out.println("result " + result1);

*/
        String result2 = (score1 > 60) ? "Pass" : "Fail";
        System.out.println("Result is " + result2);

        String quality = "Good";
        int rating = quality.equals("Good") ? 100 : 0;
        System.out.println("Rating " + rating);

        int score2 = 100;
        char grade = (score2 > 90) ? 'A' : 'B';
        System.out.println("Your grade is " + grade);


    }
}
