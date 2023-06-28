package Kunal_DSA;

import java.util.Arrays;

public class FindIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 45, 18, 7 },
                { 10, 9, 24 },
                { 77, 17, 27 }
        };
        int key = 17;
        int ans[] = search(arr, key);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int key) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr.length; column++) {
                if (arr[row][column] == key) {
                    return new int[] { row, column };
                }
            }
        }
        return new int[] { -1 };
    }
}
