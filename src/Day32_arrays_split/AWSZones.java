package Day32_arrays_split;
import java.util.Arrays;
public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        String[] zonesArray = zones.split(",");
        System.out.println(Arrays.toString(zonesArray));
        for(String each : zonesArray){
            System.out.println("Deployment [" + app + "] completed for " + each);
        }
        System.out.println("-----All Deployment completed--------");
    }
}
