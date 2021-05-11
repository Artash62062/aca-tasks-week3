package day1;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task12 {

    public static boolean contains(int [] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
