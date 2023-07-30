package Kunal_DSA;

public class DominantIndex {
    public static void main(String[] args) {
        int[] nums = { 3, 6, 1, 0 };
        System.out.println(dominantIndex(nums));
    }

    static int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] > 2 * nums[i]) {
                return -1; // Not a dominant index
            }
        }

        return maxIndex; // Return the index of the dominant element
    }
}
