package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task16 {
    public static void main(String[] args) {
        System.out.println(addReverseString("a(d(d"));
    }
    public static String addReverseString(String str) {
        if (str.length()  == 0) {
            return "";
        }
        char addingChar = str.charAt(0);
        if(addingChar == '(') {
            addingChar = ')';
        }
        return str.charAt(0) + addReverseString(str.substring(1)) + addingChar;
    }
}
