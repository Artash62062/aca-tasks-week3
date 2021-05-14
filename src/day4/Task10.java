package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(removeCopyChars("xxaabc"));
    }
    public static String removeCopyChars(String str) {
        if(str.length() == 1) {
            return str;
        }
        if(str.charAt(0)== str.charAt(1)) {
            return removeCopyChars(str.substring(1));
        }
        return str.charAt(0) + removeCopyChars(str.substring(1));
    }
}
