package Kunal_DSA;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(array));

    }

    static int findDuplicate(int[] array) {
        int start = 0;
        int ans = 0;
        // int end = array.length-1;

        // while(start<end){
        // int mid = start + (end-start)/2;
        // if (array[mid]==) {

        // }
        // }

        for (int i = 0; i < array.length; i++) {
            if (array[start] == array[i] && start != i) {
                ans = start;

            } else {
                start++;
            }
        }
        return ans;
    }
}
