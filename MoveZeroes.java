package Kunal_DSA;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = { 0, 3, 4, 0, 5, 0 };
        moveZeroes(array);
        System.out.println(Arrays.toString(array));

    }

    static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int k = j; k < nums.length; k++) {
            nums[k] = 0;
        }

    }
}
