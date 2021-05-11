package day1;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(pow(5.2, 2));
    }
    static double pow (double a , int n) {
        double aPowN = a;
        for (int i = 1; i <n ; i++) {
            aPowN = aPowN*a;
        }
        return aPowN;
    }

}
