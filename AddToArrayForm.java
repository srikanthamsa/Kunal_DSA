package Kunal_DSA;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3 };
        int k = 23;
        System.out.println(addToArrayForm(num, k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }
            result.add(0, k % 10);
            k = k / 10;
            i--;
        }
        return result;
    }

}
