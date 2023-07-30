package Kunal_DSA;

public class Staircase {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(arrangeCoins(n));

    }

    static int arrangeCoins(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int currentSum = (mid * (mid + 1)) / 2;

            if (currentSum == n) {
                return (int) mid; // Found exact number of coins needed for complete rows
            } else if (currentSum < n) {
                start = mid + 1; // Move to the end half
            } else {
                end = mid - 1; // Move to the start half
            }
        }

        return (int) end; // Return the number of complete rows
    }
}
