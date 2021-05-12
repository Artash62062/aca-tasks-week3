package day3;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task11 {
    static void bin2Dec(String string) {

        if(!isBinNumCorrect(string)) {
            System.out.println("invalid binary string" + string);
        }
        double sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += Integer.parseInt(String.valueOf(string.charAt(i))) * Math.pow(2,string.length()-i-1);
        }
        System.out.println("The equivalent decimal number for binary" + string + "is " + sum);
    }

    public static boolean isBinNumCorrect(String binNum) {
        boolean isCorrect = true;
        for (int i = 0; i < binNum.length(); i++) {
            if (binNum.charAt(i) != 1 && binNum.charAt(i) != 0) {
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }
}
