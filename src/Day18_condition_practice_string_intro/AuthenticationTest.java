package Day18_condition_practice_string_intro;
public class AuthenticationTest {
    public static void main(String[] args) {
       /*
last4SSN
pinCode

expLast4SSN
expPinCode
------------------------------
when both match:
    "Authentication successful"
when expLast4SSN does not match:
    "Last 4 of SSN did not match"
when pinCode does not match:
    "pinCode did not match"
        */

        int last4SSN = 1234;
        int pinCode = 4567;

        int expLast4SSN = 1235;
        int expPinCode = 4567;

        if(expLast4SSN == last4SSN && expPinCode == pinCode){
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (expLast4SSN != last4SSN) {
                System.out.println("Last 4 of SSN did not match");
            } else if (expPinCode != pinCode) {
                System.out.println("pinCode did not match");
            }
        }
    }
}
