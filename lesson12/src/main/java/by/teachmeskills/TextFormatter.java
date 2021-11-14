package by.teachmeskills;

import java.util.Locale;

public class TextFormatter {

    public static int numberOfWords(String s) {
        String[] sentences = s.split(" ");
        return sentences.length;
    }

    public static boolean hasPalindrome(String s) {
        String tempSentence = s.replace(",", "");
        String[] words = tempSentence.split(" ");
        for (String word : words) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;

    }

    public static boolean isPalindrome(String a) {
        if (a.length() > 1) {
            a = a.toLowerCase(Locale.ROOT);
            String b = new StringBuilder(a).reverse().toString();
            return a.equals(b);
        }
        return false;
    }
}
