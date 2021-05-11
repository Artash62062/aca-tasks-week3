package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicSum =0;
        while (true) {
            int num = scanner.nextInt();
            if(num==-1) {
                break;
            } else if(hasEight(num)) {
                magicSum+=num;
            }
        }
        System.out.println(magicSum);
    }

    public static boolean hasEight(int num) {
        while (num>0) {
            if(num%10 == 8) {
                return true;
            }
            num/=10;
        }
        return false;
    }
}
