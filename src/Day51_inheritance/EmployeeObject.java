package Day51_inheritance;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee developer = new Employee();
        System.out.println(developer.calculateSalary(55.0));

        double annualDevSalary = developer.calculateSalary(55);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));
        // no need to create object for Math because its static

        Constructor sdetContractor = new Constructor();
        sdetContractor.jobTitle = "SDET";
        double sdetSalary = sdetContractor.calculateSalary(55);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor);


    }
}
