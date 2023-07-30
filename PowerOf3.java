package Kunal_DSA;

public class PowerOf3 {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }

    static boolean isPowerOfThree(int n) {
        while (n % 3 == 0) {
            n /= 3;
        }
        // Return false if the remainder is not 0.
        return n == 1;
    }
}
