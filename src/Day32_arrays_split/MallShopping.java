package Day32_arrays_split;

import java.util.Arrays;

public class MallShopping {
    public static void main(String[] args) {

        //                     0        1        2       3           4       5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------- FIND THE INDEX OF 'GLOVES' items array----");
        System.out.println("Index of GLOVES " + Arrays.binarySearch(items, "Gloves")); // IT is not the best way

        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("gloves")){
                System.out.println("Index of GLOVES - " + i);
                break;  //exit for loop
                // System.out.println(i + " - " + items[i]); // TO FIND ALL INDEX
            }
        }

        System.out.println("-------- Set boolean to true if first 'iPad' is found----");
        boolean iPadExists = false;
//        for(int i = 0; i < items.length; i++){
//            if(items[i].equalsIgnoreCase("iPad")){
//                iPadExists = true;
//                break;
//            }
//        }

        for(String item : items){
            if(item.equalsIgnoreCase("iPad")) {
               iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExisted = " + iPadExists);

        System.out.println("------- Print a report of each shopping item-------");
        /**
         * Shoes - $99.99 - #12345
         * Jacket - $150.0 - #12346
         */
        for(int i = 0; i < items.length; i++){
            System.out.println("Item " + (i+1) +". " + items[i] + " - $" + prices[i] + " - #" + itemIDs[i] );
        }

        System.out.println("------Look for 'Jacket' in items and print all details -----");
        for(int m = 0; m< items.length; m++){
            if(items[m].equals("Jacket")){
                System.out.println(items[m]+ " - $"+prices[m] +  " ## " + itemIDs[m]);
                break;
            }
        }
    }
}
