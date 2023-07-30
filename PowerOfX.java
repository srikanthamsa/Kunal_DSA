package Kunal_DSA;

public class PowerOfX {
    public static void main(String[] args) {
        double x = 2;
        int n = 3;
        System.out.println(powerOfX(x, n));
    }

    static double powerOfX(double x, long n) {
        // when the power is negative.
        if (n < 0)
            return 1 / powerOfX(x, -n);

        // when the power is zero.
        if (n == 0)
            return 1;

        // when the power is positive and even.
        if (n % 2 == 0)
            return powerOfX(x * x, n / 2);
        // when the power is positive but not even.
        else
            return x * powerOfX(x * x, (n - 1) / 2);

    }
}
