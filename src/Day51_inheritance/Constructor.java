package Day51_inheritance;

public class Constructor extends Employee{

    @Override // 1) lets everyone know that you are override this method
              // 2) ensures that this method is being override. If not, it shows error
    public double calculateSalary(double hourlyRate){
        return 50 * 40 * hourlyRate;


    }

    @Override
    public String toString() {
        return "Constructor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
