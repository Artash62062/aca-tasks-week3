package day1;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    public static int fib (int n) {
        int firstElement = 0;
        int secondElement = 1;
        for (int i = 0; i <n ; i++) {
            int thirdElement = firstElement + secondElement;
            firstElement =secondElement;
            secondElement = thirdElement;
        }
        return secondElement;
    }
}
