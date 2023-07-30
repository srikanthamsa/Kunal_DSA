package Kunal_DSA;

import java.util.Arrays;

public class FindFinalValue {
    public static void main(String[] args) {
        int[] nums = { 8, 19, 4, 2, 15, 3 };
        int original = 2;
        System.out.println(findFinalValue(nums, original));
    }

    // using recursion approach.
    static int findFinalValue(int[] nums, int original) {
        if (Arrays.stream(nums).anyMatch(num -> num == original)) {
            return findFinalValue(nums, original * 2);
        }
        return original;
    }

    // using loops to find the answer.
    public int findFinalValue2(int[] nums, int original) {
        boolean found = true;
        while (found) {
            found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == original) {
                    original *= 2;
                    found = true;
                    break; // Break out of the loop once the value is found
                }
            }
        }

        return original;
    }

}
