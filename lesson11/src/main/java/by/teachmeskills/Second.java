package by.teachmeskills;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {


    public static boolean checkAuthorization(String login, String password, String confirmPassword) {
        try {

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
            if (!isContain(password)) {
                throw new WrongPasswordException("Пароль некорректный");
            }
            if (!isContain(login)) {
                throw new WrongLoginException("Логин некорректный");
            }

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static boolean isContain(String s) {
        Pattern p = Pattern.compile("^[a-zA-Z_0-9]{4,20}$");
        Matcher m = p.matcher(s);
        return m.find();
    }
}
