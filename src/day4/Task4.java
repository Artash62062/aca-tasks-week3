package day4;

/**
 * @author Artash-PC on 5/13/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(125));
    }
    public static int sumOfDigits(int n) {
        if(n==0) {
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
