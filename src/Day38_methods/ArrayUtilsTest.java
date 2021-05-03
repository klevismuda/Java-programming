package Day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{23,64,23,534,234,45,234,45});
        System.out.println("Sum = " + ArrayUtils.sum(nums));
        System.out.println("Sum = " + ArrayUtils.sum(new int[]{23,64,23,534,234,45,234,45}));
        System.out.println(ArrayUtils.contains(new int[]{23,64,23,534,234,45,234,45}, 45));
        int[] numbers = {2,4,5,6,7,7,8,23,34,5,76,87};
        System.out.println(ArrayUtils.contains(numbers, 20));
    }
}
