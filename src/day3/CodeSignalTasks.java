package day3;

import java.util.Arrays;

/**
 * @author Artash-PC on 5/12/2021
 *
 */
public class CodeSignalTasks {
    public static void main(String[] args) {
        System.out.println(areSimilar(new int[]{4, 6, 3}, new int[]{3, 6, 4}));
    }

    static boolean areSimilar(int[] A, int[] B) {
        if (A.length != B.length) return false;
        Arrays.sort(A);
        Arrays.sort(B);
        int countSwap = 0;
        if (!Arrays.equals(A, B)) return false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) countSwap++;
        }

        return (countSwap == 2 || countSwap == 0);
    }
}


