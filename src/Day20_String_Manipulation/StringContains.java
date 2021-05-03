package Day20_String_Manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("it")); //true
        System.out.println(company.contains("l o")); //true

        //if company contains space, print "multiple words company name"
        //else "single word company name
        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        }else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        }else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "ahmed";
        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("Name " + firstName + " contains \"a\" and \"e\"");
        } else {
            System.out.println("a && e not present");
        }

        String email = "klevis.blue@GMAIL.edu";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid mail");
        }
        // CASE INSESITIVE CONTAINS
        if(email.toLowerCase().contains("gma")){
            System.out.println("gma is present");
        }else {
            System.out.println("gma is not present");
        }
    }
}
