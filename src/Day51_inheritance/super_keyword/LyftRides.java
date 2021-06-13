package Day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft LyftRide = new Lyft();
        LyftXL LyftXLRide = new LyftXL();
        Lux LuxRide = new Lux();

        System.out.println("LyftRide for 5 miles = $" + LyftRide.calculateRate(5));
        System.out.println("LyftXLRide for 5 miles = $" + LyftXLRide.calculateRate(5));
        System.out.println("LuxRide for 5 miles = $" + LuxRide.calculateRate(5));
    }
}
