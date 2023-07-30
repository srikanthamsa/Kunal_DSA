package Kunal_DSA;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 5 };
        int[] result = removeDuplicates(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j++] = nums[i];
            }
        }
        return Arrays.copyOf(nums, j);
    }
}
