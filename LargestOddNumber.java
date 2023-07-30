package Kunal_DSA;

public class LargestOddNumber {
    public static void main(String[] args) {
        String num = "10133890";
        System.out.println(largestOddNumber(num));
    }

    static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0)
                return num.substring(0, i + 1);
        }
        return "";
    }
}
