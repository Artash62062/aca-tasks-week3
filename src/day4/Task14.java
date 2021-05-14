package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task14 {
    public static void main(String[] args) {
        System.out.println(addAsteriksToString("HELLO"));
    }
    public static String addAsteriksToString (String str) {
        if(str.length() == 1) {
            return str;
        }
        return str.charAt(0)+"*"+addAsteriksToString(str.substring(1));
    }
}
