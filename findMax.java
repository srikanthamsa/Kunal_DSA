package Kunal_DSA;

public class findMax {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 14, 5, 24, -4, -53, 0, 7, 18 };
        System.out.println(isMax(arr));
    }

    static int isMax(int[] arr) {
        int value = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                value = arr[i];
            }
        }
        return value;
    }
}
