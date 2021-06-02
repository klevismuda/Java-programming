package Day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(dayDay(3));
        System.out.println(dayDay(6));
        System.out.println(dayDay(10));
        for(int i = 0; i < 8; i++){
            System.out.println(i + " = " + dayDay(i));
        }
        String today = dayDay(4);
        System.out.println(today);
        String someDay = dayDay(0);
        if(someDay == null){
            System.out.println("Write another number");
        }
        }
    public static String dayDay (int day){

        switch (day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("Invalid day - " + day);
                return null; // nothing, no object
        }
    }

    public static String getDayNameV2(int day) {
        String dayName;
        switch(day) {
            case 1: dayName = "Monday"; break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;
        }
        return dayName;
    }

}
