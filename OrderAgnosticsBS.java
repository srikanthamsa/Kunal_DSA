package Kunal_DSA;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] array = { 10, 8, 6, 4, 4, 2, 1 };
        System.out.println(search(array, 2));
    }

    static int search(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
