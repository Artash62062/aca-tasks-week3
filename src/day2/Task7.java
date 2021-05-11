package day2;

/**
 * @author Artash-PC on 5/11/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task7 {
    public static int max (int a,int b) {
       return Math.max(a,b);
    }

    public static int max (int a,int b,int c) {
        return Math.max(a,Math.max(b,c));
    }

    public static int max (int a,int b,int c,int d) {
        return Math.max(a,Math.max(b,Math.max(c,d)));
    }
}
