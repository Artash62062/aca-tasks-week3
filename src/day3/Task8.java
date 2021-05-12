package day3;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task8 {
    public static boolean isPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length()-1; i <=0 ; i++) {
            stringBuilder.append(string.charAt(i));
        }
        return string.equals(stringBuilder.toString());
    }
}
