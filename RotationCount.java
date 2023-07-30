package Kunal_DSA;

public class RotationCount {
    public static void main(String[] args) {
        int[] array = { 15, 18, 2, 3, 6, 12 };
        int pivot = findPivot(array);
        System.out.println(findRotationCount(pivot));
    }

    public static int findPivot(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] < array[mid - 1]) {
                return mid - 1;
            } else if (array[mid] > array[mid + 1]) {
                return mid;
            } else if (array[mid] > array[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (array[array.length - 1] > array[array.length - 2]) {
                return 0;
            }
        }
        return start;
    }

    static int findRotationCount(int pivotIndex) {
        if (pivotIndex == 0) {
            return 0;
        }
        int count = pivotIndex + 1;
        return count;
    }
}
