package day4;

/**
 * @author Artash-PC on 5/13/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(fact(5));
        int [] arr = new int[]{1,2,3,4,5};
        System.out.println(sumArr(arr, 0));
    }
    public static int fact(int n) {
        if(n==1) {
            return 1 ;
        }
        return n * fact(n-1);
    }

    public static int sumArr(int [] arr,int index) {
        if(index == arr.length) {
            return 0;
        }
        return arr[index]+sumArr(arr,++index);
    }
}
