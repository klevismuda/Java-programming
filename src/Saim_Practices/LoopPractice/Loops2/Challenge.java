package Saim_Practices.LoopPractice.Loops2;
import java.util.Random;
public class Challenge {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;
        String stringNum = "";

        do {
            randomNumber = random.nextInt(1000000);
            stringNum = String.valueOf(randomNumber);

        } while (stringNum.charAt(0) == stringNum.charAt(1) ||
                stringNum.charAt(0) == stringNum.charAt(2) ||
                stringNum.charAt(0) == stringNum.charAt(3) ||
                stringNum.charAt(0) == stringNum.charAt(4) ||
                stringNum.charAt(0) == stringNum.charAt(5) ||
                stringNum.charAt(1) == stringNum.charAt(2) ||
                stringNum.charAt(1) == stringNum.charAt(3) ||
                stringNum.charAt(1) == stringNum.charAt(4) ||
                stringNum.charAt(1) == stringNum.charAt(5) ||
                stringNum.charAt(2) == stringNum.charAt(3) ||
                stringNum.charAt(2) == stringNum.charAt(4) ||
                stringNum.charAt(2) == stringNum.charAt(5) ||
                stringNum.charAt(3) == stringNum.charAt(4) ||
                stringNum.charAt(3) == stringNum.charAt(5) ||
                stringNum.charAt(4) == stringNum.charAt(5));

        System.out.println("Random Number = " + randomNumber);

    }
}
