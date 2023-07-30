package Kunal_DSA;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        System.out.println(search(arr, 3));

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticsBS(int[] array, int target, int start, int end) {
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

    static int search(int[] array, int target) {
        int peak = peakIndexInMountainArray(array);
        int firstTry = orderAgnosticsBS(array, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticsBS(array, target, peak + 1, array.length - 1);
        }
    }
}
