package day4;

/**
 * @author Artash-PC on 5/13/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(contOfSeven(717777));
    }

    public static int contOfSeven (int n) {
        if(n==0){
            return 0;
        }
        if(n%10 ==7) {
            return contOfSeven(n / 10) + 1;
        }else  {
            return contOfSeven(n / 10);
        }
    }


}
