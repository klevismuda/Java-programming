package Day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(2, 5, 30, 34);
        addNumbers(21,32,434,5,54,56,675,7,7575,7,757,57,2,98);
        addNumbers();

        // int... myNumbers = 10, 5 ERROR, var-args can ONLY be used as a method parameter

    }
    public static void addNumbers(int... nums){   //creating an Array nums[]
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Sum = " + sum);
    }
}
