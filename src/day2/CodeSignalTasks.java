package day2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Artash-PC on 5/11/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class CodeSignalTasks {
    public static void main(String[] args) {
        int [] a = new int[] {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(sortByHeight(a)));
    }
    /*int matrixElementsSum(int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count =0;
        for(int i=0 ; i< matrix.length ;i++) {
            for(int j =0;j<matrix[i].length;j++) {
                if(arrayList.contains(j)){
                    continue;
                }
                if(matrix[i][j] == 0) {
                    arrayList.add(j);
                } else {
                    count += matrix[i][j];
                }
            }
        }

        return count;
    }*/

    /*public static ArrayList<String> allLongestStrings(String[] inputArray) {

        int maxlength = getMaxLengthOfStrings(inputArray);
        ArrayList<String>strings = new ArrayList<>();
        for (int i = 0; i < inputArray.length ; i++) {
            if(maxlength == inputArray[i].length()) {
                strings.add(inputArray[i]);
            }
        }
        return strings;
    }

    public static int getMaxLengthOfStrings(String [] inputArray) {
        int maxLength = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].length()>maxLength){
                maxLength = inputArray[i].length();

            }
        }
        return maxLength;
    }*/

    /*static int commonCharacterCount(String s1, String s2) {
        String maxString;
        String minString;
        if (s1.length() > s2.length()) {
            maxString = s1;
            minString = s2;
        } else {
            maxString = s2;
            minString = s1;
        }
        int count = 0;
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < minString.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < maxString.length(); j++) {
                if(index.contains(j)){
                    continue;
                }
                if (minString.charAt(i) == maxString.charAt(j)){
                    count ++;
                    index.add(j);
                    break;
                }
            }
        }
        return count;
    }*/
    /*static boolean isLucky(int n) {

        int leftCount = 0;
        int rightCount = 0;
        int stepLength = String.valueOf(n).length() / 2;
        for (int i = 0; i < stepLength ; i++) {
            leftCount += n % 10;
            n=n/10;
        }
        for (int i = 0; i < stepLength; i++) {
            rightCount += n % 10;
            n=n/10;
        }
        return rightCount==leftCount;

    }*/
    static int[] sortByHeight(int[] a) {

        int n = a.length;
        for (int i = 0; i < n; i++){
            if(a[i]==-1) continue;
            for (int j = i; j < n; j++){
                if(a[j]== -1 )continue;
                if(a[j]<a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;

    }
}
