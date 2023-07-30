package Kunal_DSA;

public class AddBinary {
    public static void main(String[] args) {
        String binary1 = "101";
        String binary2 = "11";

        String result = add(binary1, binary2);
        System.out.println("Sum: " + result);
    }

    static String add(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
}
