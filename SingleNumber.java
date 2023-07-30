package Kunal_DSA;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 5, 4 };
        System.out.println(findSingleNumber(nums));
    }

    static int findSingleNumber(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the duplicate element
        int pointer1 = nums[0];
        int pointer2 = slow;
        while (pointer1 != pointer2) {
            pointer1 = nums[pointer1];
            pointer2 = nums[pointer2];
        }

        return pointer1; // Return the duplicate element
    }
}
