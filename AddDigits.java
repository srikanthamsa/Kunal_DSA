package Kunal_DSA;

public class AddDigits {
    public static void main(String[] args) {
        int number = 48;
        System.out.println(addDigits(number));
    }

    static int addDigits(int number) {
        while (number / 10 >= 1) {
            int firstDigit = number / 10;
            int secondDigit = number % 10;
            number = firstDigit + secondDigit;
        }
        return number;
    }
}
