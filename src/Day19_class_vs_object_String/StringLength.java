package Day19_class_vs_object_String;

public class StringLength {
    public static void main(String[] args) {
        String company = "Amazon";
        System.out.println("Number of character is " + company.length());
        System.out.println("wooden spoon".length());

        String firstName = "Klevis";
        System.out.println("First name: " + firstName + " has " + firstName.length() + " characters");

        String password = "abc12";
         if (password.length() >= 6){
             System.out.println("Valid Amazon password");
         } else {
             System.out.println("Password mus be at least 6 characters");
         }

    }
}
