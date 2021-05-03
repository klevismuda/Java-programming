package Replit.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "It started to snow in Chicago";
        String[] sentenceArr = sentence.split(" ");
        String word = "";
        String reverse = "";

        for (int i = 0; i < sentenceArr.length; i++) {
            word="";
            word += sentenceArr[i] + " ";

            for (int j = word.length()-1; j >=0 ; j--) {
                reverse +=word.charAt(j);
            }


        }
        System.out.println(reverse.trim());
    }
}
