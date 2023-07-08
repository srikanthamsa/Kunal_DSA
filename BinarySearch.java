package Kunal_DSA;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { -1, 3, 5, 6, 7, 13, 15, 24, 33, 47, 51, 57, 67, 72, 93, 100 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search for: ");
        int input = sc.nextInt();
        sc.close();
        System.out.println("The number was found at index: " + search(arr, input));

    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
