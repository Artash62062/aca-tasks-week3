package day2;

/**
 * @author Artash-PC on 5/11/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Main {
    public static void main(String[] args) {

    }

    public static int doSomething(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int doSomething(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[i].length; i1++) {
                sum += matrix[i][i1];
                count++;
            }
        }
        return sum;
    }


    public static double calculateDistance (int x,int y) {
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public static double calculateDistance(int x,int y,int x1,int y1) {
        return  Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
    }
}
