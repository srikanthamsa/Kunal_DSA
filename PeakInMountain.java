package Kunal_DSA;

public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 10, 6, 3, 2 };
        System.out.println("The peak element in this mountain arr is " + arr[peakIndexInMountainArray(arr)]);

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
}
