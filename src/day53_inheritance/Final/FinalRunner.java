package day53_inheritance.Final;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; ERROR: cannot change value of final variable
        final int SSN = 123147494;
        // SSN = 77791793;
    }
}
