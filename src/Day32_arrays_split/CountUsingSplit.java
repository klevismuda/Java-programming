package Day32_arrays_split;
import java.util.Arrays;
public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray = cats.split(" ");
        int count = 0;
        for(int i = 0; i < catsArray.length; i++){
            if(catsArray[i].equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println("There are " + count + " cats");

        System.out.println("There are " + (catsArray.length-1)); // Another way

    }
}
