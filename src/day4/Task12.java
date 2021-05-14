package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println(countOfDigitsInString("155abc"));
    }
    public static int countOfDigitsInString(String str) {
        if(str.length() == 0) {
            return 0;
        }
        if(str.charAt(0) >=48 && str.charAt(0)<=57) {
            return 1+countOfDigitsInString(str.substring(1));
        }
        return countOfDigitsInString(str.substring(1));
    }
}
