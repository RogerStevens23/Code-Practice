import java.util.Scanner;

public class Sum {
    // Fields
    public int sum = 0, lowerNum = 0, higherNum = 0;
    public boolean correctFormat = false;

    // Methods
    public static int getUserInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public int calculateSum() {
        while (lowerNum <= higherNum) {
            sum += lowerNum;
            lowerNum++;
        }
        return sum;
    }

    public String checkFormat() {
        if (higherNum <= lowerNum)
            return "Incorrect format, please try again...";
        else {
            correctFormat = true;
            return "Format correct!";
        }
    }
}