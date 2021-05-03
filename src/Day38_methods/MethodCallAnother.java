package Day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {

        start();
    }
    public static void start(){
        System.out.println("start");
        continous();
    }
    public static void continous(){
        System.out.println("continous");
        end();
    }
    public static void end(){
        System.out.println("end");
       // start(); goes to infinite loop if we put at the end
    }

}
