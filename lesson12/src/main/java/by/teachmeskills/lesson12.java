package by.teachmeskills;


public class lesson12 {
    public static void main(String[] args) {

        String string = "Hello, world";

        String stringDel = string.replace(string.substring(string.indexOf("w"), string.lastIndexOf("")), "");
        System.out.println(stringDel);
        String stringReplace = string.replace(string.substring(3, 4), string.substring(0, 1));
        System.out.println(stringReplace);

        String[] mass = {"дед", "мама", "солнце", "заказ", "небо"};
        printWords(mass);

        String text = "За нашим домом есть сад." +
                "В саду растут яблони, груши, сливы и вишни." +
                "Есть кусты малины. На грядках растёт клубника. " +
                "Дед любит сад и ухаживает за ним";
        String[] sentences = text.split("\\.");
        for (String sentence : sentences) {
            if (TextFormatter.numberOfWords(sentence) > 2 && TextFormatter.numberOfWords(sentence) < 6) {
                System.out.println(sentence + ". ");
            } else if (TextFormatter.hasPalindrome(sentence)) {
                System.out.println(sentence + ". ");
            }
        }


    }

    public static void printWords(String[] mass) {
        for (String a : mass) {
            if (TextFormatter.isPalindrome(a)) {
                System.out.println(a);
            }
        }

    }


}
