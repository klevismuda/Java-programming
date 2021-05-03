package Day41_arraylist;
import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arrayList   alt/enter to import library
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arrayList -> add methods

        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabat to 0 index
        cities.add(0, "Ashgabat");
        //print all value in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        // use size() - 1
        System.out.println("LAst city + " + cities.get(cities.size()-1));

        int size = cities.size();
        System.out.println("There are " + size + " cities in the list");

        //for loop and print all values in same line

        for(int i = 0; i < cities.size(); i++){
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
        for(String city : cities){
            System.out.print(city + ", ");
        }
        System.out.println();
        //delete item from arrayList
        //1) remove using index. delete values at index 3
        cities.remove(3);
        //2) remove using object/value
        cities.remove("New York");

        System.out.println("After remove = " + cities);

        //delete all values from list
        cities.clear();
        //1) print|spit it out
        System.out.println("cities = " + cities);

        //2) using isEmpty()
        if(cities.isEmpty()){
            System.out.println("List is empty");
        }
        //3) check size is 0
        if(cities.size() == 0){
            System.out.println("List is empty");
        }

    }
}
