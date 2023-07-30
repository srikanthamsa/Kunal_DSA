package Kunal_DSA;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 1, 3, 6 };
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {

            int sum = digits[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        // If the carry is still 1, we need to add a new element to the array.
        if (carry > 0) {
            result = Arrays.copyOf(result, result.length + 1);
            result[0] = carry;
        }

        return result;
    }

}
