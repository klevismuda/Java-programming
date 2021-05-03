package OfficeHours.Practice_31_03_2021;

public class CountJava2 {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javascript";
        int count = 0;


        // str.substring(0, 4)
        // str.substring(1, 5)
        // str.substring(2, 6)
        // str.substring(3, 7)

        for(int i = 0; i < str.length() - 3; i++){
            String eachFourLetters = str.substring(i, i+4);
            if(eachFourLetters.equals("java")){
                count++;

            }
        }
        System.out.println("we have java " + count + " times");
    }
}
