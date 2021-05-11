package day2;

/**
 * @author Artash-PC on 5/11/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task4 {
    public static void print(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length ; i++) {
            if(i== arr.length-1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(" ]");
    }
    public static void print (double[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length ; i++) {
            if(i== arr.length-1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(" ]");
    }

    public static void print (float[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length ; i++) {
            if(i== arr.length-1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(" ]");
    }

}
