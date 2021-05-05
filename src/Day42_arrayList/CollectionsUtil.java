package Day42_arrayList;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("Size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);

        System.out.println("reversed = " + letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'a', 'u');
        System.out.println("After replace All " + letters);

        System.out.println(letters.toString());

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23, 1, 43, 65, 2, 7, 12, 23, -10, 23);
        System.out.println("nums = " + nums);

        Collections.reverse(nums);
        System.out.println("After reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countOf5s = Collections.frequency(nums, 23);
        System.out.println("countOf5 = " + countOf5s);

        int countOf1s = Collections.frequency(nums, 1);
        System.out.println("countOf1s = " + countOf1s);

        Collections.replaceAll(nums, 12, 44);
        System.out.println("After replace 12 with 44 = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("After reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);  // shuffle to randomize
    }
}
