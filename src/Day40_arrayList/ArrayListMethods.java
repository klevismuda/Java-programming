package Day40_arrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, coding java go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, coding java go to mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in list");
        } else {
            System.out.println("Shoes is not in the list");
        }

        System.out.println("Buying shoes ... $80");
        shoppingList.remove("shoes");
        System.out.println("list = " + shoppingList);
        
    }
}
