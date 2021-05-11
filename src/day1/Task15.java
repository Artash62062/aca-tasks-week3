package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task15 {
    public static void main(String[] args) {
        System.out.println("Enter the Student Number");
        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        int [] grades = initGradesInArr(studentNum);
        System.out.println("The average is" + average(grades));
    }

    public static float average(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static int min(int [] arr) {
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int [] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] initGradesInArr(int size) {
        Scanner scanner = new Scanner(System.in);
        int [] grades = new int[size];
        for (int i = 1; i <= grades.length; i++) {
            grades[i-1] = scanner.nextInt();
        }
        return grades;
    }
}
