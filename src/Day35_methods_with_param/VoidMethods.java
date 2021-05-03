package Day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            printAtoZ();
            System.out.println();
        }
        displayUSFlag();
    }
    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
    }
    public static void displayUSFlag (){
        System.out.println("----------------- FLAG OF USA -------------------------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
