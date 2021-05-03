package Day13_conditional_statement;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("*** WELCOME TO TD BANK ATM ***");
        int secretPincode = 12345;
        int inputPincode = 12345;
        if (secretPincode == inputPincode){
            System.out.println("Welcome to your account.\nYou can withdraw, check balance, deposit");
        }
        else{
            System.out.println("Incorrect pincode! 1234\nPlease try again.");
        }
        System.out.println("Thank you for using TD BANK ATM");
    }
}
