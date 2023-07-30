package Kunal_DSA;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = { 1, 0, 3 };
        System.out.println(missingNumber(array));
    }

    static int missingNumber(int[] array) {
        int length = array.length;
        int expectedSum = (length * (length + 1)) / 2;

        for (int num : array) {
            expectedSum -= num;
        }
        return expectedSum;
    }
}
