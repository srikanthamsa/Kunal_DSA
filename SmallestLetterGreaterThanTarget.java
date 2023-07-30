package Kunal_DSA;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = { 'a', 'b', 'c', 'd', 'e' };
        char target = 'e';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}