package Kunal_DSA;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Fibonacci Series up to " + n + " numbers:");

        // Calculate and display the Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    // Recursive method to calculate the Fibonacci number
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
