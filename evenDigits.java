package Kunal_DSA;

public class EvenDigits {
    public static void main(String[] args) {
        int[] array = { 12, 234, 7869, 90, 126, 10, 15, 20 };
        System.out.println(findNumbers(array));
    }

    static int findNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num) {
        int digits = numberOfDigits(num);
        return digits % 2 == 0;
    }

    static int numberOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        return digits;
    }
}
