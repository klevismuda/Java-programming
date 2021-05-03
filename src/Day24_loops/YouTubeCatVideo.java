package Day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int second = 1;
        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        while(second <= 117){
            System.out.println("Watching \uD83D\uDC08 Video second - " +second);
            second++;
            Thread.sleep(1000);  // SPEED OF COMPILING
        }
        System.out.println("Finished watching cat video, next video...");


    }
}
