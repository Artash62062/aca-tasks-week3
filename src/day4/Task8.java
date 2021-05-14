package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(reverse("HELLO"));
    }
    public static String reverse (String str) {
        if (str.isEmpty()) {
            return "";
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
