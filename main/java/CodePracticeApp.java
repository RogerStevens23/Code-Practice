import MenuScreen.MenuScreenApp;
import OOPDesignShapes.OOPDesignShapesApp;
import PracticeClasses.IfElseInclusiveNum;
import PracticeClasses.ThreeInputsThreeOutputs;
import javaCollections.ComparablesDemo;
import javaCollections.Maps.HashMapPractice;

public class CodePracticeApp {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(front22("He"));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return(talking && (hour < 7 || hour > 20));
    }

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }

    public static String missingChar(String str, int n) {
        StringBuilder result = new StringBuilder();
        if(!str.equals("") && n >= 0 && n <= str.length() - 1) {
            for(int i = 0; i <= str.length() - 1; i++) {
                if(i != n)
                    result.append(str.charAt(i));
            }
            return result.toString();
        }
        else
            return str;
    }

    public static String frontBack(String str) {

        if(str.length() > 1) {
            StringBuilder result = new StringBuilder();
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);
            result.append(end);
            for(int i = 0; i <= str.length() - 1; i++) {
                if(i != 0 && i != str.length() - 1)
                    result.append(str.charAt(i));
            }
            result.append(start);
            return result.toString();
        }
        else
            return str;
    }

    public static String backAround(String str) {
        return "" + str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }

    public static boolean or35(int n) {
        return ((n % 3 == 0 || n % 5 == 0));
    }

    public static String front22(String str) {
        if(str.length() >= 2)
            return str.substring(0, 2) + str + str.substring(0, 2);
        else
            return str+str+str;
    }
}