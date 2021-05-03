package Day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCAr();
        shiftToDrive();
        pressGazPedal();

    }
    public static void pressGazPedal(){
        System.out.println("4. Hold steering wheel with 2 hands and press gas pedal");
    }
    public static void seatInCar(){
        System.out.println("1. Open the door and seat in driver sear");
    }
    public static void startTheCAr(){
        System.out.println("2. Insert the key to ignition and turn clockwise");
    }
    public static void shiftToDrive(){
        System.out.println("3. Press break pedal and shift to 'D");
    }

}
