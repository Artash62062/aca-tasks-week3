package day3;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task9 {
    public static String isBinNumCorrect(String binNum) {
        StringBuilder sb = new StringBuilder();
        sb.append(binNum);
        boolean isCorrect = true;
        for (int i = 0; i < binNum.length(); i++) {
            if (binNum.charAt(i) != 1 && binNum.charAt(i) != 0) {
                isCorrect = false;
                break;
            }
        }

        if(isCorrect) {
            sb.append(" Is NOT ");
        }else {
            sb.append(" is ");
        }

        sb.append( " Binary number");

        return sb.toString();
    }
}
