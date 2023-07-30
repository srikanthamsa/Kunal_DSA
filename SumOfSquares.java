package Kunal_DSA;

public class SumOfSquares {
    public static void main(String[] args) {
        long c = 2147483600;
        System.out.println(judgeSquareSum(c));

    }

    static boolean judgeSquareSum(long c) {
        long start = 0;
        long end = (long) Math.sqrt(c);

        while (start <= end) {
            long sum = start * start + end * end;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
