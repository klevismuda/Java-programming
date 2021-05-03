package Day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'l';
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                index = i;
                System.out.println("letter is " + letter + " in index " + index);
                break;  //exit for loop
            }
        }
        if(index == -1){
            System.out.println("letter is " + letter + " and is not matched in index ");
        }
    }
}
