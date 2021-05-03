package Day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        /**
         * below is infinite loop for loop like
         */

        for(int i = 0; i <= 5; i++){
            System.out.println("Java is fun!");
        }
        int sum = 0;
        // for loop: 1-10. print numbers
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
