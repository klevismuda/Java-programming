package day53_inheritance.Tesla;

public class ModelX extends ElectricCar{

    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
    }

    /**
     ERROR below because charge() is final method and cannot be overridden
     */
//    public void charge(){
//
//    }
}
