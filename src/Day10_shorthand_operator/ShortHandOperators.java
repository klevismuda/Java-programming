package Day10_shorthand_operator;

public class ShortHandOperators {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);
        // 6 cars left parking lot
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);

        cars= cars - 1;
        cars -= 1;
        System.out.println("cars in parking lot = " + cars);

        int electricCar=13;
        // cars=cars+electricCar;
        cars+=electricCar;
        System.out.println("cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("Word = " + word);

        word=word + " programming";
        System.out.println("Word = " + word);
        //add "is fun"
        word += " is fun";
        System.out.println("Word = " + word);

        String selenium= " \"Selenium\" is more fun.";
        word += selenium;
        System.out.println("Word = " + word);

        word +=1234;
        System.out.println("Word = " + word);

        char letter='A';
        System.out.println("Letter = " + letter);
        letter +=3;
        System.out.println("Letter = " + letter);
        // add letter J
        letter +=6;
        System.out.println("Letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50 off
        //parkingFee = parkingFee / 2;
        parkingFee /= 2;

        System.out.println("early bird parking fee = " + parkingFee);
        //weekend parking is free
        parkingFee -= parkingFee;//parkingFee = parkingFee - parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);

    }
}
