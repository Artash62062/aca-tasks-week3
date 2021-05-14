package day4;

/**
 * @author Artash-PC on 5/14/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task15 {
    public static void main(String[] args) {
        System.out.println(addBraces("HeLLo"));
    }
    public static String addBraces (String str) {
        if(str.length() <= 2) {
            return "(" + str +")";
        }
        return "(" + str.charAt(0) +addBraces(str.substring(1,str.length()-2)) + str.charAt(str.length()-1)+")";
    }
}
