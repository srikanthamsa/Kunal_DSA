package Kunal_DSA;

public class RemoveElement {
    public static void main(String[] args) {
        int[] num = { 3, 2, 2, 3 };
        int val = 3;

        int ans = removeElement(num, val);
        System.out.println(ans);

    }

    static int removeElement(int[] nums, int val) {

        /*
         * Using ArrayList, for when you want to return the list/array of numbers which
         * were not removed, rather than just the number of elements that were not
         * removed.
         * 
         * static ArrayList<Integer> removeElement(int[] nums, int val) {
         * 
         * ArrayList<Integer> list = new ArrayList<>();
         * 
         * for (int i = 0; i < nums.length; i++) {
         * if (nums[i] != val) {
         * list.add(nums[i]);
         * }
         * }
         * return list;
         * 
         */

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            }
        }
        return count;
    }
}
