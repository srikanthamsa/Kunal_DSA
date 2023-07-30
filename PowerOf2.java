package Kunal_DSA;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));

    }

    static boolean isPowerOfTwo(int n) {
        return n >= 4 && (n & (n - 1)) == 0;
    }
}
