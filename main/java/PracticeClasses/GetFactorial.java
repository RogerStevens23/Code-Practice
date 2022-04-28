package PracticeClasses;

public class GetFactorial {
    public static String getFactorial(int userNum) {
        int sum = userNum;
        for (int i = userNum - 1; i > 0; i--) {
            sum *= i;
        }
        return String.format("The factorial of %s is: %s", userNum, sum);
    }
}
