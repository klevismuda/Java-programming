package Day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int banana = 0;
        int countToFood = 3;

        while(isHungry){     //while(isHungry || bananas != countToFull)
            banana++;
            System.out.println("Eat banana " + banana);
            if(banana == countToFood){
                isHungry = false;

            }
        }
        System.out.println("I am full, I had " + banana + " bananas");
    }
}
