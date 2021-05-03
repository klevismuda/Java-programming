package Day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String ifAcceptable = (hourlyRate > 45) ? "Accept" : "Reject";
        System.out.println("Reply is " + ifAcceptable);

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Murodil" : "Nadir";
        System.out.println("Today's teacher " + teacher);

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive == true) ? "have DL, can drive" : "not DL, can drive";
        System.out.println(driving);
    }
}
