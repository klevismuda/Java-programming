package day53_inheritance.Tesla;

public class Roadster extends ElectricCar{
        //Roadster r = new Roadster("Roadster", 200000, 2022, 620);
    public Roadster(String model, double price, int year, int range) {
        //"Tesla", "Roadster", 200000, 2022, 620
        super("Tesla", model, price, year, range); //we can use hardcoding for TESLA
        System.out.println("Welcome new Roadster");
    }
}
