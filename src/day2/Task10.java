package day2;

/**
 * @author Artash-PC on 5/11/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task10 {

    public static int reminder(int num) {
        int sum = 0;
        while(num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static int reminder(int num,int divider) {
        int sum = 0;
        while(num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum%divider;
    }
}
