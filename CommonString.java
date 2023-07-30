package Kunal_DSA;

public class CommonString {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "bcd";
        System.out.println(longestCommonSubsequence(a, b));
    }

    static int longestCommonSubsequence(String text1, String text2) {
        int count = 0;
        if (text1.contains(text2)) {
            count++;
        }
        return count;
    }
}
