package Day16_switch_ternary;
/*
declare variable floorNum = 1
Multi branch if:
when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"

when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"

when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

anything else: print "Invalid floor - 6"
 */
public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;
        switch (floorNum){
            case 1:
                System.out.println("Floor 1 selected. Compamies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. LYFT, BOFA,Steak House");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
        }
    }
}
