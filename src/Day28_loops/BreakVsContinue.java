package Day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        // break statement
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            if (i == 3) {
                break;
            }
        }
        System.out.println();

        for(int i = 1; i <= 5; i++){
            if (i == 2 || i == 4){
                continue;  // goto next iteration. skip the code below

            }
            System.out.print(i);
        }

    }
}
