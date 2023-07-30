package Kunal_DSA;

public class EquivalentStrings {
    public static void main(String[] args) {
        String[] word1 = { "My", "name", "is", "Srikant" };
        String[] word2 = { "My", "name", "is", "Srikant" };
        System.out.println(checkIfEqual(word1, word2));

    }

    static private boolean checkIfEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String word : word1) {
            sb1.append(word);
        }
        String str1 = sb1.toString();

        StringBuilder sb2 = new StringBuilder();
        for (String word : word2) {
            sb2.append(word);
        }
        String str2 = sb2.toString();
        return str1.equals(str2);
    }
}
