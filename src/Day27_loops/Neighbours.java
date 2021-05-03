package Day27_loops;
/*
String word = "jaaavvaa";

if 2 side by side characters match: signal beep - a
aa -> beep - a
vv -> beep - v
aa -> beep - a
 */
public class Neighbours {
    public static void main(String[] args) {
        String word = "jaavvaa spoonn";
        for(int index = 0; index < word.length() - 1; index++){
            if(word.charAt(index) == word.charAt(index + 1)){
                System.out.println("" + word.charAt(index) + word.charAt(index + 1) + " -> beep - " + word.charAt(index));
            } else {
                System.out.println("" + word.charAt(index) + word.charAt(index + 1) + " -> Not match");
            }
        }
    }
}
