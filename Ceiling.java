package Kunal_DSA;

public class Ceiling {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 6, 10, 13, 16, 18 };
        int target = 17;
        int ans = getCeiling(array, target);
        System.out.print("The index of the ceiling element is " + ans + ", that means, " + array[ans] + ".");
    }

    static int getCeiling(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
