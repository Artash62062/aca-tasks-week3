package day3;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println(duplicateCount("acdaaa"));
    }
    public static  int duplicateCount (String string) {
        int count=0;
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j <stringBuilder.length() ; j++) {
                if(stringBuilder.charAt(i)== stringBuilder.charAt(j) && i!=j) {
                    count ++;
                    break;
                }
            }
        }
        return count;
    }
}
