package Day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.setCity("Tysons");
        myAddress.setCountry("USA");
        myAddress.setStreet("7925 Jones Branch Dr");
        myAddress.setZipCode("3300");
        myAddress.setState("VA 22102");
        System.out.println(myAddress.toString());

        Address newAddress = new Address();
        System.out.println(newAddress.toString()); //null, null, null, null, USA
    }


}
