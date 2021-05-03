package Day10_shorthand_operator;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance=1230.55;
        System.out.println("balance = " +balance);

        double baklava=22.50;
        System.out.println("Price of baklava = " + baklava);
        balance=balance-baklava;
        System.out.println("Balance after baklava = " + balance);

        double kenafa=44.45;
        System.out.println("Price of kenafa = " + kenafa);
        balance=balance-kenafa;
        System.out.println("Balance after kenafa = " + balance);

        // second kenefa is 50% off. Lets buy it
        kenafa=kenafa/2;
        System.out.println("Price of second kenafa = " + kenafa);
        balance=balance-kenafa;
        System.out.println("Balance after second kenafa = " + balance);

        double plov=7.99;
        System.out.println("Plov = " + plov);
        balance=balance-plov;
        System.out.println("Balance after plov = " + balance);

        //return baklava
        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);

        double icedTea=4.0;
        System.out.println("IcedTea = " + icedTea);
        balance=balance - icedTea * 4;
        System.out.println("Balance after four IcedTea = " + balance);


    }



}
