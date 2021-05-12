package day3;

/**
 * @author Artash-PC on 5/12/2021
 * @product IntelliJ IDEA
 * @project aca_tasks-week_3
 */
public class Task10 {
    public static String isHexNum(String hexNum) {
        hexNum = hexNum.toLowerCase();
        final String hexAlphabet = "0123456789ABCDEF";
        StringBuilder stringBuilder = new StringBuilder(hexNum);
        boolean isHexCorrect = true;
        for (int i = 0; i < hexNum.length(); i++) {
            if (!hexAlphabet.contains(String.valueOf(hexNum.charAt(i)))) {
                isHexCorrect = false;
                break;
            }
        }
        if (isHexCorrect) {
            stringBuilder.append(" is ");
        } else {
            stringBuilder.append(" Is Not ");
        }
        stringBuilder.append("Hex Number");
        return stringBuilder.toString();
    }
}
