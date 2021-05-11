package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 54;
        int c = 42;
        int d = 75;
        System.out.println(min(a, b, c, d));
    }
    static int min (int a, int b, int c,int d) {
        int min = Integer.MAX_VALUE;
        if(a<b) {
            min = a;
        } else{
            min = b;
        }
        if (c<d && c<min) {
            min =c;
        } else if (d<min) {
            min = d;
        }
        return min;
    }

}
