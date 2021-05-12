package day3;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task6 {
    public static String reverse(String string) {
        StringBuilder revString = new StringBuilder();
        for (int i = 0; i <string.length() ; i++) {
            revString.append(string.charAt(string.length()-1-i));
        }
        return revString.toString();
    }
}
