package day2;

/**
 * @author Artash-PC on 5/11/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task5 {
    public static int sizeOf(int [] array) {
        return array.length;
    }
    public static int search(int [] array,int a) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public boolean search (int [] array,int element,int index) {
        return array[index]==element;
    }
}
