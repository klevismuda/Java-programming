package Day24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPincode = 1234;
        int enterPincode;
        do{
            System.out.println("Enter pincode");
             enterPincode = scan.nextInt();

        } while(enterPincode != secretPincode);
        System.out.println("Welcome to your account");
    }
}
