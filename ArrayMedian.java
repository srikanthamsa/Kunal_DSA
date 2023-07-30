package Kunal_DSA;

public class ArrayMedian {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        System.out.println(findMedian(nums1, nums2));
    }

    static double findMedian(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int totalLength = m + n;
        int medianIndex = totalLength / 2;

        int i = 0;
        int j = 0;
        int prev = 0;
        int current = 0;

        while (i + j <= medianIndex) {
            prev = current;
            if (i == m) {
                current = nums2[j];
                j++;
            } else if (j == n) {
                current = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                current = nums1[i];
                i++;
            } else {
                current = nums2[j];
                j++;
            }
        }

        if (totalLength % 2 == 0) {
            return (prev + current) / 2.0;
        } else {
            return current;
        }
    }
}
