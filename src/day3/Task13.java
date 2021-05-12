package day3;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task13 {
    public static char findFirstNonRepitChar (String str) {
        char ch='-';
        for (int i = 0; i < str.length(); i++) {
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                if(i==j) continue;
                if(str.charAt(i)==str.charAt(j)) {
                    count ++;
                }
                if(count == 0) {
                    ch = str.charAt(i);
                    break;
                }
            }
        }
        return ch;
    }
}
