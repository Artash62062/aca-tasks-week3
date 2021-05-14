package day4;

/**
 * @author Artash-PC on 5/13/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(removeX("xaxage"));
    }

    public static String removeX (String s) {
        if (s.equals("")) {
            return"";
        }
        if(s.charAt(0)=='x') {
            return removeX(s.substring(1));
        }
        return s.charAt(0) + removeX(s.substring(1));

    }
}
