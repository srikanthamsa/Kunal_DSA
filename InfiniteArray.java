package Kunal_DSA;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 0;
        System.out.println(ans(array, target));
    }

    static int ans(int[] array, int target) {
        int start = 0;
        int end = 1;

        while (target > end) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return search(array, target, start, end);
    }

    static int search(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
