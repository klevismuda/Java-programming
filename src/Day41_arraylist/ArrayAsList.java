package Day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
//        nums.add(100);  //UnsupportedOperationException
//        nums.remove(0); // the reason UnsupportedOperationException is when we use Arrays.asList
        //it will return immutable list, that size cannot be modified.
        // But we can do any other operations on it

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));  // to remove number not index of 23.
        System.out.println("numsList = " + numsList);

        /**
         List String with drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambocha, celsius
         int caffeineAmount = 0;
         String drink = "monster";
         monster, red bull, celsius:
           caffeineAmount = 150
         coffee, kambocha:
           caffeineAmount = 112
         tea, coffee, pepsi, mdew:
            caffeineAmount = 35
         */

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster",
                "red bull", "coke", "pepsi", "mdew", "kambocha", "celsius"));
        int caffeineAmount = 0;

        for(String drink : drinksWithCaffeine){
            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if(drink.equals("coffee") || drink.equals("kambocha")){
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if(drink.equals("tea") || drink.equals("coffee") || drink.equals("pepsi") || drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);
            }
        }

        for(String drink : drinksWithCaffeine) {
            switch(drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.print(drink + ", "));
        
        drinksWithCaffeine.forEach(drink -> {
            System.out.println("This is forEach block");
            System.out.println("drink = " + drink);
        });

    }
}
