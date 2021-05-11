package day1;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(isVowel('A'));
    }
    public static boolean isVowel(char symbol) {
        switch (symbol) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
