package PracticeClasses;

import java.util.Scanner;
import java.util.regex.*;


public class IfElseInclusiveNum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void run() {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n % 2 == 0)
        {
            if(n >= 6 && n <= 20)
                System.out.println("Weird");
            else if(n >= 2 && n <= 5 || n > 20)
                System.out.println("Not Weird");
        }
        else
            System.out.println("Weird");

        scanner.close();
    }
}