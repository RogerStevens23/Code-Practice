package CodingBatPracticeClasses;

public class Warmup1 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

    public static int sumDouble(int a, int b) {
        if(a != b)
            return a+b;
        else
            return (a+b)*2;
    }

    public static int diff21(int n) {
        if(n > 21)
            return Math.abs((n - 21)) * 2;
        else
            return Math.abs((n - 21));
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

    public static Boolean mixStart(String str) {
        return(str.length()>2 && str.substring(1, 3).equals("ix"));
    }

    public static String startOz(String str) {
        if(str.length() >= 2 && str.charAt(0) == 'o' && str.charAt(1) == 'z')
            return "oz";
        else if(str.length() >= 1 && str.charAt(0) == 'o')
            return "o";
        else if(str.length() >= 1 && str.charAt(1) == 'z')
            return "z";
        else return "";
    }

    public static int intMax(int a, int b, int c) {
        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else return c;
    }

    public static int close10(int a, int b) {
        if(Math.abs(10 - a) < Math.abs(10 - b))
            return a;
        else if(Math.abs(10 - a) > Math.abs(10 - b))
            return b;
        else return 0;
    }

    public static boolean in3050(int a, int b) {
        return(inRange3040(a)&&inRange3040(b) || inRange4050(a)&&inRange4050(b));
    }
    public static boolean inRange3040(int a) {
        return(a >= 30 && a <= 40);
    }
    public static boolean inRange4050(int a) {
        return(a >= 40 && a <= 50);
    }

    public static int max1020(int a, int b) {
        boolean aInRange = inRange1020(a), bInRange = inRange1020(b);
        if(aInRange && bInRange)
            return Math.max(a, b);
        else if(aInRange)
            return a;
        else if(bInRange)
            return b;
        else return 0;
    }
    public static boolean inRange1020(int a) {
        return(a >= 10 && a <= 20);
    }

    public static boolean stringE(String str) {
        int eCount = 0;
        for(char c : str.toCharArray()) {
            if(c == 'e')
                eCount++;
        }
        return(eCount >= 1 && eCount <= 3);
    }

    public static boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }

    // Only one not solved by myself.
    public static String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }

    public static String everyNth(String str, int n) {
        String result = "";
        for(int i = 0; i < str.length() - 1; i++)
            if(i == 0 || i % n == 0)
                result += str.charAt(i);
        return result;
    }
}
