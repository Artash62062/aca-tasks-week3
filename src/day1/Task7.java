package day1;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task7 {
    public static void main(String[] args) {

    }
    public static long fact (int n) {
        long fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
}
