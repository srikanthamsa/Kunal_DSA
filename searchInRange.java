package Kunal_DSA;

public class SearchInRange {
    public static void main(String[] args) {
        int[] numbers = { 10, 12, 14, 15, 4, 7, 18, 11, 24, 69 };
        int key = 69;
        System.out.println(inRange(numbers, key, 2, 7));
    }

    static int inRange(int[] numbers, int key, int start, int end) {
        if (key == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }
}
