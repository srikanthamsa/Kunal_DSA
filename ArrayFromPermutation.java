package Kunal_DSA;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] num = { 0, 2, 1, 5, 3, 4 };
        // ans = {0, 1, 2, 5, 3, 4}
        int[] result = buildArray(num);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] buildArray(int[] num) {
        int n = num.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = num[num[i]];
        }
        return ans;
    }
}
