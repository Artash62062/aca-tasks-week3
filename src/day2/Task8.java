package day2;

/**
 * @author Artash-PC on 5/11/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task8 {

    public static double distance (int x,int y) {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public static double distance (int x,int y,int x1, int y1) {
        return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
    }
}
