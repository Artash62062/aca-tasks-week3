package day4;

/**
 * @author Artash-PC on 5/13/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n) {
        if(n==1||n==2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
