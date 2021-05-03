package Day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("FizzBuzz numbers");
        for (int n = 0; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n + " -> FizzBuzz");
            } else if (n % 3 == 0){
                    System.out.println(n + " -> Fizz");
                } else if (n % 5 == 0){
                System.out.println(n + " -> Buzz");
            } else {
                System.out.println(n + " -> NOT FizzBuzz or Buzz or FIzz");
            }
        }
        /** OSE
//        System.out.println("\nFizz numbers");
//        for (int k = 0; k <= 100; k++) {
//            if (k % 3 == 0 && k % 5 != 0) {
//                System.out.print(k + " ");
//            }
//        }
//        System.out.println("\nBuzz numbers");
//        for (int j = 0; j <= 100; j++) {
//            if (j % 5 == 0 && j % 3 != 0) {
//                System.out.print(j + " ");
//            }
//        }
         */
    }
}
