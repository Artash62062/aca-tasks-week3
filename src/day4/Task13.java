package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.println(maxDigitOfString("1554"));
    }
    public static int maxDigitOfString (String str) {
        if(str.length()==0) {
            return 0;
        }
        int num = Integer.parseInt(String.valueOf(str.charAt(0)));

        return Math.max(num, maxDigitOfString(str.substring(1)));
    }
}
