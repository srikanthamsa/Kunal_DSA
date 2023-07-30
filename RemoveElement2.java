package Kunal_DSA;

import java.util.ArrayList;

public class RemoveElement2 {
    public static void main(String[] args) {
        int[] array = { 1, 23, 2, 3, 23, 4, 23, 5, 23 };
        int[] ans = arrayList(array, 23);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    static int[] arrayList(int[] array, int removeAll) {
        ArrayList<Integer> modifiedArray = new ArrayList<Integer>();
        for (int num : array) {
            if (num != removeAll) {
                modifiedArray.add(num);
            }
        }
        int[] newArray = modifiedArray.stream().mapToInt(Integer::intValue).toArray();
        return newArray;
    }
}
