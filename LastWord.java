package Kunal_DSA;

public class LastWord {
    public static void main(String[] args) {
        String s = ("My name is Srikant");
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String text) {
        String[] numberOfWords = text.split(" ");
        String lastWord = numberOfWords[numberOfWords.length - 1];
        int length = lastWord.length();
        return length;
    }
}
