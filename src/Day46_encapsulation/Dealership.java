package Day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        //ERROR below, model and year are PRIVATE
        //car1.model = "Nissan Altima";
        //car1.year = 2020;
        car1.setModel("Nissan Altima");
        System.out.println("car1.getModel() = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1.getYear() = " + car1.getYear());

        car1.setMileage(170_000);
        System.out.println("car1.getMileage() = " + car1.getMileage());

        System.out.println(car1.toString());  //Automatically calls toString method
        System.out.println(car1); // Are the same
        
        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("alfaRomeo.getModel() = " + alfaRomeo.getModel());
        System.out.println("alfaRomeo.getYear() = " + alfaRomeo.getYear());
        System.out.println("alfaRomeo.getMileage() = " + alfaRomeo.getMileage());

        System.out.println("alfaRomeo = " + alfaRomeo);


    }
}
