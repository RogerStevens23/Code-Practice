import MenuScreen.MenuScreenApp;
import OOPDesignShapes.OOPDesignShapesApp;
import PracticeClasses.IfElseInclusiveNum;
import PracticeClasses.ThreeInputsThreeOutputs;
import javaCollections.ComparablesDemo;
import javaCollections.Maps.HashMapPractice;

public class CodePracticeApp {

    public static void main(String[] args) {
        String str = "adelbc";
        //System.out.println(str.substring(1, 3));
        System.out.println(delDel("adel"));
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

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static boolean icyHot(int temp1, int temp2) {
        return(temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100);
    }

    public static boolean in1020(int a, int b) {
        return(a >= 10 && a <= 20 || b >= 10 && b <= 20);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return(a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19);
    }

    public static boolean loneTeen(int a, int b) {
        return(inRange(a) && !inRange(b) || inRange(b) && !inRange(a));
    }
    public static boolean inRange(int n) {
        return (n >= 13 && n <= 19);
    }

    public static String delDel(String str) {
        if(str.length() >= 4 && str.substring(1, 4).equals("del"))
            return str.charAt(0) + str.substring(4);
        else return str;
    }

}