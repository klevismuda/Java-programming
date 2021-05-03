package Day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        printNum(10);
        printNum100(1);
    }
    public static void printNum(int num){
        System.out.println(num + " ");
        num--;
        if(num >= 0){
            printNum(num);
        }
    }
    public static void printNum100(int num2){
        System.out.print(num2 + " ");
        num2++;
        if(num2 <= 100){
            printNum100(num2);
        }
    }
}
