package day1;

import java.util.*;

/**
 * @author Artash-PC on 5/10/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class TaskUnkonown {

    public static void main(String[] args) {
        String[] strings = new String[]{"abc", "abx", "axx", "abc"};
        System.out.println(stringsRearrangement(strings));
    }

    public static boolean stringsRearrangement(String[] strings) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < strings.length; i++) {
            if (stringCharDifferenceCount(strings[0], strings[i])) {
                if (!list.contains(0)) list.add(0);
                if (!list.contains(i)) list.add(i);
            }
        }
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < strings.length; j++) {
                if (stringCharDifferenceCount(strings[list.get(i)], strings[j]) && !(list.contains(j))) {
                    list.add(j);
                }
            }
        }
        return strings.length == list.size();
    }


    public static boolean stringCharDifferenceCount(String str1, String str2) {
        if (str1.length() == 1 && str1.equals(str2)) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }


}
