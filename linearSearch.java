package Kunal_DSA;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 10, 12 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search for: ");
        int key = sc.nextInt();
        sc.close();

        if (key == 0) {
            System.out.println("Enter a non zero number.");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index:  " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
