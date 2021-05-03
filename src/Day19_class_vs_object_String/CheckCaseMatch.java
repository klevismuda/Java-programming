package Day19_class_vs_object_String;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "AL";
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println("Country code: " + countryCode + " is correct.");
        } else {
            System.out.println("Country code: " + countryCode + " is incorrect.");
        }
    }
}
