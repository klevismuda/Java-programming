package Day19_class_vs_object_String;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intelliJ idea";
        System.out.println(word.startsWith("int"));
        System.out.println(word.startsWith("inte"));
        System.out.println(word.startsWith("ide"));
        System.out.println(word.endsWith("dea"));
        System.out.println("java".startsWith("J"));
        System.out.println("java".startsWith("j"));

        String firstName = "Dr. Klevis";
        if (firstName.startsWith("Mr.")){
            System.out.println(firstName + " is Man");
        } else if (firstName.startsWith("Dr.")){
            System.out.println(firstName + " is Doctor");
        } else if (firstName.startsWith("Mrs.")){
            System.out.println(firstName + " is Married woman");
        } else if (firstName.startsWith("Ms.")){
            System.out.println(firstName + " is Single woman");
        } else if (firstName.startsWith("Sr.")){
            System.out.println(firstName + " is Senior");
        } else {
            System.out.println("Normal name");
        }

        String url = "https://www.cybertekschool.com/";
        if (url.endsWith(".com")){
            System.out.println(url + " is commercial web site.");
        } else if (url.endsWith(".ru")){
            System.out.println(url + " is Russian web site.");
        } else if (url.endsWith(".gov")){
            System.out.println(url + " is government web site.");
        } else if (url.endsWith(".edu")){
            System.out.println(url + " is education web site.");
        } else if (url.endsWith(".org")){
            System.out.println(url + " is organization web site.");
        }
    }
}
