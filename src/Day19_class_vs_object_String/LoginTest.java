package Day19_class_vs_object_String;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

//        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
//            System.out.println("Pass - user successfully logged in");
//        } else if (expUserName.equalsIgnoreCase(userName) && !expPassword.equals(password)) {
//            System.out.println("Incorrect password");
//        } else if (!expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
//            System.out.println("Incorrect Username");
//        } else {
//            System.out.println("try again");
//        }

      if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully ");
        }else {
            if(!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - username is incorrect");
            }else{
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}
