package Day09_scanner_practice;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("####### Temperature Convertor #######");
        System.out.println("Enter temperature in Fahrenheit:");
        double Fahrenheit = scan.nextDouble();
        double celsius = (Fahrenheit - 32)*5/9;
        System.out.println(Fahrenheit + "F is converted " + celsius + "°C");
    }
}
