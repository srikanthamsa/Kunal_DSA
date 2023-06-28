package Kunal_DSA;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the fruit: ");
        String fruit = sc.next();

        switch (fruit) {
            case "Apple" -> System.out.println("Red");
            case "Mango" -> System.out.println("Yellow");
            case "Banana" -> System.out.println("Long");
            case "Orange" -> System.out.println("Round");
            default -> System.out.println("Enter a valid fruit name");
        }

        sc.close();
    }
}
