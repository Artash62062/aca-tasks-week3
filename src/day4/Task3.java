package day4;

/**
 * @author Artash-PC on 5/13/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(fib(1));
    }
    public static int fib(int n) {
        if(n==0) {
            return 0;
        }
        return n+fib(n-1);
    }
}
