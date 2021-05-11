package day1;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task13 {

    public static int search(int [] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
