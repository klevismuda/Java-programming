package Day29_nestedLopp_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
        }

        for(int i = 1; i <=10; i++){
            System.out.println();
            for(int j = 1; j <=i; j++){
                System.out.print("\uD83C\uDF1F ");
            }
        }

        for(int i = 10; i >=1; i--){
            System.out.println();
            for(int j = 1; j <=i; j++){
                System.out.print("\uD83C\uDF1F ");
            }
        }
    }

}
