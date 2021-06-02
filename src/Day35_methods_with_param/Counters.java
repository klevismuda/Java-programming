package Day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(6);
        count(10);
        int num = 999;
        count(num);
        String word = "wooden spoon";
        count(word.length());  // 12
        printAge(1989);

    }
    public static void count (int num){
        for (int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAge(int year){

        System.out.println("Birth year: " + year + ". Age: " + (2021 - year));
    }
}
