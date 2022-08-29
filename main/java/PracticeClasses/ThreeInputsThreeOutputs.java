package PracticeClasses;

import java.util.Scanner;

public class ThreeInputsThreeOutputs {

    public static void run() {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        int i = scan.nextInt();
        scan.close();
        Scanner scanLine = new Scanner(System.in);
        String s = scanLine.nextLine();
        scanLine.close();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}