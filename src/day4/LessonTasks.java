package day4;

/**
 * @author Artash-PC on 5/13/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class LessonTasks {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
    public static int sum (int n) {
        if(n==0){
            return 0;
        }
        return n+ sum(n-1);
    }
}
