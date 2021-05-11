package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        testIsPalindrome();
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome (int num) {
        String str = String.valueOf(num);
        String revStr = "";
        for (int i = 0; i < str.length(); i++) {
            revStr += str.charAt(str.length()-1-i);
        }
        return revStr.equals(str);
    }

    public static void testIsPalindrome () {
        int num1 = 1221;
        boolean num1Answer = true;
        int num2 =1234;
        boolean num2Answer = false;
        if (num1Answer == isPalindrome(num1) && num2Answer == isPalindrome(num2)) {
            System.out.println("Is Palindrome works correct");
        }
    }
}