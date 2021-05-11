package day2;

/**
 * @author Artash-PC on 5/11/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task9 {
    public static void fahrenheitCelsius(float celsius,int choice) {
        if(choice == 1) {
            System.out.println((int) (celsius * 9 / 5) + 32);
        } else if (choice == 2) {
            System.out.println((celsius * 9 / 5) + 32);
        } else {
            System.out.println("Invalid choice ");
        }
    }
    public static void fahrenheitCelsius(int choice,float fahrenheit) {
        if(choice == 1) {
            System.out.println((int) ((fahrenheit-32) * 5 / 9));
        } else if (choice == 2) {
            System.out.println((((fahrenheit-32) * 5 / 9)));
        } else {
            System.out.println("Invalid choice ");
        }
    }
}
