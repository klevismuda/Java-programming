package Day19_class_vs_object_String;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.equals("Chicago")); //true
        System.out.println(city.equals("CHICAGO")); // false
        System.out.println(city.equals("chicago")); // false

        // equalsIgnoreCase()   is method to ignore whether the case is upper or lower case

        System.out.println(city.equalsIgnoreCase("Chicago")); //true
        System.out.println(city.equalsIgnoreCase("CHICAGO")); // true
        System.out.println(city.equalsIgnoreCase("chicago")); // true

        if(city.equals("CHICAGO")) {
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() false");
        }

    }
}
