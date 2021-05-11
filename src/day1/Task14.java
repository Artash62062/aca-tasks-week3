package day1;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task14 {
    public static int[] copyOf (int [] arr) {
        int [] copyArr = new int[arr.length];
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }
}
