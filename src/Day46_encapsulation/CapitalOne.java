package Day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(9249494482L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Smith");
        acc.setType("360 checking");

        System.out.println("acc = " + acc);
    }
}
