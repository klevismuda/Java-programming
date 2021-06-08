package Day48_contructors_static;

import java.util.ArrayList;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.setName("Bob");
        cs1.setId(1);
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);  // create object and assign values in same statment
        Customer cs3 = new Customer("John", 4871);
        System.out.println(cs2);
        System.out.println(cs3);

        //Array Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Klevis", 32)};

        //arrayList Customers objects
        ArrayList<Customer> customersList = new ArrayList<>();
        customersList.add(cs2);
        customersList.add(cs1);
        customersList.add(cs3);
        customersList.add(new Customer("Bahsir", 449));
        customersList.add(new Customer("Suleyman", 9763));

        //Print info of first customer object in array and arrayList
        System.out.println(todaysCustomers[0].toString()); // Customer{name='Bob', id=1}
        System.out.println(customersList.get(0).toString()); //Customer{name='Mike', id=2}

        System.out.println(customersList);

        System.out.println("----FOR LOOP--------");
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));
        }

        System.out.println("----for each loop--------");
        for (Customer each : customersList){
            System.out.println(each);
        }

        //print only names of Customers in the list
        customersList.forEach(each -> System.out.println(each.getName()));
        for (Customer each : customersList){
            System.out.println(each.getName());
        }

    }
}
