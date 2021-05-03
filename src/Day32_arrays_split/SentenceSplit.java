package Day32_arrays_split;

import java.util.Locale;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("3rd word = " + words[2]);

        for(String each : words){
            System.out.println(each);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] results = googleResult.split(" ");
        System.out.println(results[1]);
        System.out.println("Time = " + results[3].substring(1));

        String cats = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray = cats.split(" ");
        int count = 0;
        for(int i = 0; i < catsArray.length; i++){
            if(catsArray[i].equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println("There are " + count + " cats");

        System.out.println(catsArray.length-1); // Another way
    }
}
