package PracticeClasses;

public class ReverseInt {
    public static int reverseInt(int userNum) {
        String userNumString = String.valueOf(userNum), result = "";
        for (int i = userNumString.length() - 1; i >= 0; i--) {
            result += userNumString.charAt(i);
        }
        return Integer.parseInt(result);
    }
}
