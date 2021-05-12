package day3;

import java.util.Locale;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(cesarCode("zzz", 4));
    }

    public static String cesarCode(String string, int n) {
        int replaceAsciiCode;
        StringBuilder stringBuilder = new StringBuilder(string.toUpperCase());
        for (int i = 0; i < stringBuilder.length(); i++) {
            if ((int) string.charAt(i) + n > 90) {
                replaceAsciiCode = (((int) string.charAt(i) + n) % 90) + 65;
            } else {
                replaceAsciiCode = (int) (string.charAt(i)) + n;
            }
            stringBuilder.replace(i, i + 1, String.valueOf((char) replaceAsciiCode));
        }
        return stringBuilder.toString().toUpperCase();
    }
}
