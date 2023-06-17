package Kunal_DSA;

import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        String text = "I am the visionary, I am the revolutionary, I am Srikant Freakin' Hamsa";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word or phrase you want to search for: ");
        String key = sc.nextLine();
        sc.close();
        // System.out.println(search(text, key));

        // To search a String in a String, using 'str.contains(targetString)' method.
        if (text.contains(key)) {
            System.out.println("Yes, the string does contain the word " + key + " in it");

        }

        else {
            System.out.println("The string " + key + " is not present in the String.");
        }
    }

    // Searching for a character in a String

    // static boolean search(String str, char key) {
    // if (str.length() == 0) {
    // return false;
    // }

    // for (int i = 0; i < str.length(); i++) {
    // if (key == str.charAt(i)) {
    // return true;
    // }
    // }
    // return false;
    // }

}
