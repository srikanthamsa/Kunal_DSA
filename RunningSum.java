package Kunal_DSA;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 2 };
        System.out.println(Arrays.toString(getRunningSum(nums)));

    }

    static int[] getRunningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = nums[i] + runningSum[i - 1];
        }
        return runningSum;
    }
}
