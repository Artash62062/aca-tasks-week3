package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println(isNumPrime(11));
    }
    public static boolean isNumPrime (int n ,int i ) {
        if(n<=2){
            return n == 2;
        }
        if(n%i==0) {
            return false;
        }
        if(i*i>n) {
            return true;
        }

        return isNumPrime(n,i+1);
    }
    public static boolean isNumPrime (int n) {
       return isNumPrime(n,2);
    }
}
