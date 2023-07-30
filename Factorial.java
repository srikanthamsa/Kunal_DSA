package Kunal_DSA;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(6));
    }

    static long findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
