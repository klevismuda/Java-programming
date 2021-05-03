package Day18_condition_practice_string_intro;

public class SwitchCheckNumber {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        switch(num1) {
            case 10:
                num1++;
                num2 += 10;
                break;
            case 20:
                num1 += num2;
                num2--;
                break; // result is 30  9  and without break it continuous with case 30 and result will be 0  6
            case 30:
                num1 = 0;
                num2 -= 3;
                break;
        }
        System.out.println(num1);
        System.out.println(num2);

    }
}
