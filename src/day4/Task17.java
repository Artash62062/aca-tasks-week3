package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task17 {
    public static void main(String[] args) {
        System.out.println(removeSimetricChars("BadaB"));
    }
    public static String removeSimetricChars (String str) {
        if(str.length() <= 2) {
            return str;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)) {
            return removeSimetricChars(str.substring(1,str.length()-1));
        }
        return str.charAt(0) + removeSimetricChars(str.substring(1,str.length()-1)) + str.charAt(str.length()-1);
    }
}
