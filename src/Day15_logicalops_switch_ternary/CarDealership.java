package Day15_logicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5_000;
        //Interested in Toyota , Honda, OR Tesla
        String model = "Toyota";
        double carPrice = 4500;
        if ((model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) && carPrice <= 5000){
            System.out.println("Ready to purchase mode = " + model + ", price = $" + carPrice);
        } else {
            System.out.println("Not interested to purchase mode = " + model + ", price = $" + carPrice);
        }

    }
}
