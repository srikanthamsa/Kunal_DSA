package Kunal_DSA;

import java.util.Scanner;

public class LinerSearch2 {
    public static void main(String[] args) {
        int[] nums = { 20, 5, 10, 23, 17, 12, 7, 17, 18 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search for: ");
        int target = sc.nextInt();
        sc.close();

        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] nums, int target) {
        if (target == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
