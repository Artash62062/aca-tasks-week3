package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class HanoTown {
    public static void main(String[] args) {
        int blocsCount = 4;
        String firstTower = "First Tower";
        String secondTower = "Second Tower";
        String thirdTower = "Third Tower";
        constructHanno(blocsCount, firstTower, secondTower, thirdTower);

    }

    public static void constructHanno(int top, String from, String mid, String to) {
        if (top == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            constructHanno(top - 1, from, to, mid);
            System.out.println("Disk " + top + " from " + from + " to " + to);
            constructHanno(top - 1, mid, from, to);
        }
    }
}
