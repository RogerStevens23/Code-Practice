import java.util.Scanner;

public class PrintTable {
    public static int getUserInt() {
        boolean correctFormat = false;
        int result = 0;
        Scanner input = new Scanner(System.in);
        while (!correctFormat) {
            System.out.println("\nPlease enter a positive number...");
            result = input.nextInt();
            if (result % 2 == 0) {
                correctFormat = true;
                break;
            }
        }
        input.close();
        return result;
    }

    public static void printDivisibleTable(int userNum) {
        int remainder = 0, divisible = 0, multiplicative = 1;
        boolean exit = false;
        while (!exit) {
            divisible = userNum / multiplicative;
            remainder = userNum % multiplicative;
            if (remainder == 0) {
                System.out.println(divisible + " X " + multiplicative + " = " + userNum);
                multiplicative++;
            } else
                exit = true;
        }
    }

    public static void printMultiplicationTable(int userNum) {
        int result = 0;
        for (int i = 0; i <= 12; i++) {
            result = userNum * i;
            System.out.println(userNum + " X " + i + " = " + result);
        }
    }
}