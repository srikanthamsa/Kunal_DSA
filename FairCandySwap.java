package Kunal_DSA;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 3 };
        int[] bobSizes = { 2, 4 };
        System.out.println(Arrays.toString(swap(aliceSizes, bobSizes)));
    }

    static int[] swap(int[] aliceSizes, int[] bobSizes) {
        if(checkSum(aliceSizes, bobSizes) == false){
            
        }
    }

    static boolean checkSum(int[] aliceSizes, int[] bobSizes) {
        int sumBob = 0;
        int sumAlice = 0;
        boolean sumEqual = true;
        for (int i = 0; i < bobSizes.length; i++) {
            sumBob = sumBob + bobSizes[i];
        }
        for (int i = 0; i < aliceSizes.length; i++) {
            sumAlice = sumAlice + aliceSizes[i];
        }

        if (sumAlice != sumBob) {
            return sumEqual = false;
        }
        return sumEqual;
    }
}
