package day3;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task4 {
    public static String vowelCount(String str) {
        String vowels = "a, e, i, o, u, A, E, I, O, U";
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(String.valueOf( str.charAt(i)))){
                count++;
            }
        }

        return count +" "+ (count*100)/str.length();
    }
}
