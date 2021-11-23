import java.util.List;
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
            String newA = a.replaceAll("[^\\a-zA-Zа-яёА-ЯЁ]", "");
            a = a.toLowerCase(Locale.ROOT);
            String b = new StringBuilder(a).reverse().toString();
            return a.equals(b);
        }
        return false;
    }

    public static void checkText(List<String> blackList, String[] sentences) {
        int counterWrongSentences = 0;
        for (String sentence : sentences) {
            if (checkSentence(blackList, sentence)) {
                System.out.println(sentence + ".");
                counterWrongSentences++;
            }
        }
        if (counterWrongSentences > 0) {
            System.out.println("Количество предложений не прошедших проверку " + counterWrongSentences);
        } else {
            System.out.println("Текст прошел проверку");
        }
    }

    private static boolean checkSentence(List<String> blackList, String sentence) {
        for (String s : blackList) {
            boolean a = (sentence.toLowerCase(Locale.ROOT)).contains(s);
            if (a) {
                return true;
            }
        }
        return false;
    }
}
