package Kunal_DSA;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = { 30, 11, 23, 4, 20 };
        int h = 5;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            int count = 0;
            for (int pile : piles) {
                count += (pile + mid - 1) / mid;
            }
            if (count <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

}