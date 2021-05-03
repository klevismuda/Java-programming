package Day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0){
            System.out.println("reverse - " + count);
            count-- ;
        }
        System.out.println("Finished the count");

        int unreadSMS = 10;
        while (unreadSMS >= 0){
            System.out.println("Left " + unreadSMS + " unread \uD83D\uDC8C");
            unreadSMS--;
        }
        System.out.println("No any SMS");
    }
}
