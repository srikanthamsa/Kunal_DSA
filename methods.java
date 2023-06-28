package Kunal_DSA;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int sum = sum(20, 30);
        System.out.println("The sum is " + sum);
    }

    static int sum(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        a = sc.nextInt();
        System.out.print("enter second number: ");
        b = sc.nextInt();
        sc.close();
        int sum = a + b;
        return sum;
    }
}
