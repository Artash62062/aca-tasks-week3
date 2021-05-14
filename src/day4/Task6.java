package day4;

/**
 * @author Artash-PC on 5/13/2021
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(lowerCaseCharactersCount("aAbBcC"));
    }
    public static int lowerCaseCharactersCount( String string) {
        StringBuilder sb = new StringBuilder(string);
        if(string.length() == 0) {
            return 0;
        }
        int a = (int) sb.charAt(sb.length()-1);
        if(sb.charAt(sb.length()-1)>=97 && string.charAt(sb.length()-1)<=122){
            return lowerCaseCharactersCount(sb.deleteCharAt(sb.length()-1).toString())+1;
        }
        return lowerCaseCharactersCount(sb.deleteCharAt(sb.length()-1).toString());

    }
}
