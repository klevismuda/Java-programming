package Day24_loops;
/*
main method

int apples = 1;
until 10

while apples is less than or equal 10
    print eating an apple 1
    increase apple by 1

No more apples 😦
 */
public class WhileLoopApples {
    public static void main(String[] args) {
        int apples = 1;
        while(apples <=10){
            System.out.println("eating an apple - " + apples);
            apples++;
        }
        System.out.println("No more apples \uD83D\uDE26");
    }
}
