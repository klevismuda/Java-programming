package Day21_String_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

//        String word1 = "java";
//        for(int i =0; i<word1.length(); i++){
//            System.out.println(word1.charAt(i));
//        }
        System.out.println(word + "-" + word.length());

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        char first = company.charAt(0);
        System.out.println(first);
        //Cybertek

//        System.out.println(company.charAt(0) + " " + company.charAt(1) + " " + company.charAt(2)
//                + " " + company.charAt(3)+ " " + company.charAt(4)+ " " + company.charAt(5)
//                + " " + company.charAt(6)+ " " + company.charAt(7));


        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);

        //C y b e r t e k
        System.out.println(first +" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth
                +" "+seventh +" "+eighth);

        String withSpaces = first +" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth
                +" "+seventh +" "+eighth;

        System.out.println("withSpaces = " + withSpaces);
    }
}
