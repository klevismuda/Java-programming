package Day06_arithmetic_operators;

public class MoreCarsOperators {
    public static void main(String[]args){
        int toyotas =431;
        int honadas=233;
        int vw=2;
        int tesla=21;
        int nissan=1;
        int bmw=155;
        int totalCarsInParking=toyotas+honadas+vw+tesla+nissan+bmw;
        System.out.println("There are "+totalCarsInParking+" cars in parking");
        String pizza="hawaiian";
        int slices=8;
        int people=4;
        int slicesPeople=slices/people;
        //there are 2 slides per person
        System.out.println("There are "+slicesPeople+" "+pizza+" pizza slides per person");
        //We ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with "+ slices + " slices, " + people +
                " people ate " + slicesPeople + "  slices each." );
    }
}
