package Day18_condition_practice_string_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 3;
        switch (month){
            case 11: case 12: case 1:
                System.out.println("It is winter");
                break;
            case 2: case 3: case 4:
                System.out.println("It is Spring");
                break;
            case 5: case 6: case 7:
                System.out.println("It is Summer");
                break;
            case 8: case 9: case 10:
                System.out.println("It is Fall");
                break;
            default:
                System.out.println("You should write month 1-12");

        }
    }
}
