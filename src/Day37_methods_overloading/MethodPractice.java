package Day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3 , '|'));
        System.out.println(repeatString("I can do it", 10, '-'));
    }
    public static String repeatString (String word, int times, char delimiter){
        String finalVersion = "";
        for(int i = 0; i < times; i++){
            finalVersion += word+delimiter;

            /** if(i == times){            nje menyre tjeter per te heq delimiter e fundit
                finalVersion += word;
            } else {
                finalVersion += word+delimiter;
            }
             */
        }
        return finalVersion.substring(0, finalVersion.length()-1);


    }
}
