package Day36_methods_with_return;
import java.util.*;
import org.jetbrains.annotations.Contract;

public class Info {
    public static void main(String[] args) {
        System.out.println("Full Name = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("age = " + getAge());
        System.out.println("Random year = " + getRandomYear()); // dynamic. Different year each time
        System.out.println("Random year = " + getRandomYear());
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        System.out.println("age = " + age);
        System.out.println("married = " + married);
        System.out.println("name = " + name);
    }

    public static String fullName() {
        System.out.println("inside fullName method");
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        int age = 35;
        return age;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
