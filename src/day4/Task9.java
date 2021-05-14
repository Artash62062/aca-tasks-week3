package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(changeXtoEnd("xxaxd"));
    }
    public static String changeXtoEnd(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return changeXtoEnd(str.substring(1)) + str.charAt(0);
        }
        return str.charAt(0) + changeXtoEnd(str.substring(1));
    }
}
