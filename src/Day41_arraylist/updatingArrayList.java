package Day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class updatingArrayList {
    public static void main(String[] args) {
       // ArrayList<String> cars = new ArrayList<>();
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0, "Jeep");
        myCars.add(1, "Lada");
        myCars.add(2, "Yugo");

        System.out.println(myCars.toString());  // no need to use toString
        String allCarsIn1St = myCars.toString(); // print all cars in one String variable
        System.out.println("allCarsIn1St = " + allCarsIn1St);

        // replace the 0 index
        myCars.set(0, "Lanborghini");
        System.out.println(myCars);

        allCarsIn1St = allCarsIn1St.replace("Jeep", "Mercedes");
        System.out.println(allCarsIn1St);

        /**
         * How would you do that if muCar is array:
         * myCars[4] = "Honda";
         */
        myCars.set(4, "Honda");
        System.out.println("After set honda = " + myCars);
        /**
         * String str = "java";
         * str.indexOf("v") --> 2
         */
        //find the index number of "Ford"
        System.out.println("index of ford = " + myCars.indexOf("Ford"));
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("MoskvichIndex = " + moskvichIndex);

        myCars.set(moskvichIndex, "jiguli");
        System.out.println(myCars);

        // replace ford with trabant in single statement
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to trabant = " + myCars);

        //lada -> bugatti
        /*
        preventing the error by using contains
        if myCars contains "lada"
            find index of lada and set value to bugatti
        else
            print "lada is not found"
         */
        if(myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        } else {
            System.out.println("lada is not found");
        }

        System.out.println("after set bugatti = " + myCars.toString());

        /**
         lamborghini -> prius
         toyota -> lexus
         trabant -> audi
         */
        for(int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("lamborghini")) {
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i , "audi");
            }
        }
        System.out.println("after loop = " + myCars);
    }
}
