package Day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {13, 31, 1331, 13, 123, 56, 45, 31, 7373, 23};
        for (int each : data) {
            System.out.print(each + " ");
        }
        // repeat above with for loop

        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

        // print all number backward in the same line
        for(int i = data.length - 1; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
    }
}

