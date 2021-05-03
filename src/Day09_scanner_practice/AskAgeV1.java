package Day09_scanner_practice;
import java.util.Scanner;
public class AskAgeV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age= scan.nextInt();
        System.out.println("What is you name?");
        String name = scan.next();
        System.out.println(name + "! " + age + " - thats great age!");
    }
}
