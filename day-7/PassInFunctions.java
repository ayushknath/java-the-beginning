import java.util.*;

public class PassInFunctions {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 7 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int[] arr) {
        arr[0] = 10;
    }
}