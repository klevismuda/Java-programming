package Day44_custom_classes;

/**
 * This class is to create objects of App
 */
public class MyApps {
    public static void main(String[] args) {
        //String app1 = "uber";  this is string object. Just character
        App uberApp = new App();//create object
        //opening Uber app - version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open(); // call open method using object variable

        uberApp.version = 4.0;
        uberApp.open();
    }
}
