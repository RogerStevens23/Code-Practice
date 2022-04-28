package InputUtils;

import java.util.Scanner;

public class Input
{
    public static int getPositiveInt()
    {
        boolean isPos = false;
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (!isPos) {
            result = input.nextInt();
            if (result >= 0)
                isPos = true;
        }
        return result;
    }
    public static double getDouble()
    {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    public static String getString()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
