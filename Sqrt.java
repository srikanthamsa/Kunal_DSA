package Kunal_DSA;

public class Sqrt {
    public static void main(String[] args) {
        int x = 14;
        System.out.println(sqrt(x));
    }

    static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 0;
        long end = x;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
