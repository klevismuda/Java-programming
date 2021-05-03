package Day35_methods_with_param;

import java.util.*;
public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        buildMail("Klevis muda", "gmail");
        String name = scan.nextLine();
        String domain = scan.nextLine();
        buildMail(name, domain);

    }
    public static void buildMail(String name, String domain){
        domain = "@" + domain + ".com";
        name = name.replace(" ", "_").toLowerCase();
        System.out.println(name+domain);

    }
}
