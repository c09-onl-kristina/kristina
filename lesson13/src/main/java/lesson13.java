import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lesson13 {
    public static void main(String[] args) {
        String a = "qwertasd";
        System.out.println(middleCharacters(a));

        String b = "cab, ccab, cccab";
        stingFinder("\\b[cab]+\\b", b);


        String c = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12 Java4.";
        stingFinder("\\bJava [0-9]*\\b", c);

        String str = "One two three раз два три one1 two2 123 ";


        System.out.println(isSuitable("erqu1jx") + ", " + isSuitable("окн07"));


    }

    public static void stingFinder(String reg, String string) {
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }


    public static String middleCharacters(String a) {
        int middle = a.length() / 2;
        return a.substring(middle - 1, middle + 1);

    }

    public static boolean isSuitable(String s) {
        Pattern p = Pattern.compile("^[a-z15]{4,20}$");
        Matcher m = p.matcher(s);
        return m.find();
    }
}
