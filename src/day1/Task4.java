package day1;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    public static boolean isPrime (int n) {
        int counter = 0;
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if(n%i == 0) {
                counter++;
            }
        }
        return counter<=2;
    }
}
