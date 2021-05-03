package Day29_nestedLopp_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
//        for(int minutes = 1; minutes <= 60; minutes++){
//            System.out.println("\nMinutes " + minutes);
//            for(int seconds = 1; seconds <= 60; seconds++){
//                System.out.print(seconds + " ");
//            }
//        }

        for (int hours = 0; hours <= 23; hours++)
            for (int minutes = 0; minutes < 60; minutes++) {
                for (int seconds = 0; seconds < 60; seconds++) {
                    System.out.println(hours+ ":" + minutes + ":" + seconds);
                   // Thread.sleep(1000);
                }
            }
    }
}
