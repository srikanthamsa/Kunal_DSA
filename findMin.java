package Kunal_DSA;

public class findMin {
    public static void main(String[] args) {
        int[] array = { -10, 12, 13, 15, 17, 19, 20, 7, 18, 1, 0, -1, -7 };
        System.out.println(min(array));
    }

    static int min(int[] array) {
        int value = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
            }
        }
        return value;
    }
}
