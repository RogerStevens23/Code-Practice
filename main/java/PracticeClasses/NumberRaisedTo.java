package PracticeClasses;

public class NumberRaisedTo {
    public static int numberRaisedTo(int base, int power) {
        int sum = base;
        for (int i = 0; i < power - 1; i++) {
            sum *= base;
        }
        return sum;
    }
}