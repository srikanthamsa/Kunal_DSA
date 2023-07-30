package Kunal_DSA;

public class PowerOf4 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    static boolean isPowerOfFour(int n) {

        while (n >= 4) {
            if (n % 4 != 0)
                return false;
            n /= 4;
        }
        return n == 1;
    }
}
