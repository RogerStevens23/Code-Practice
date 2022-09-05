package CodingBatPracticeClasses;

public class Warmup2 {
    public String stringTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++)
            result += str;
        return result;

    }

    public String frontTimes(String str, int n) {
        String result = "";
        if(str.length() >= 3) {
            for(int i = 0; i < n; i++)
                result += str.substring(0,3);
        }
        else
            for(int i = 0; i < n; i++)
                result += str;
        return result;
    }

    public static int countXX(String str) {
        int result = 0;
        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
                result++;
            }
            else if(str.charAt(i) == 'x' && str.charAt(i - 1) != 'x')
                result++;
        }
        return result;
    }

    public static boolean doubleX(String str) {
        boolean result = false;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                result = true;
                break;
            }
            else if(str.charAt(i) == 'x' || str.charAt(i + 1) != 'x')
                break;
        }
        return result;

        // A better way to do this. Using the 'indexOf()' function to find the first occurrence of 'x'.
        /*int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        Another approach -- .startsWith() simplifies the logic
        String x = str.substring(i);
        return x.startsWith("xx");*/
    }

    public static String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(i % 2 == 0)
                result.append(str.charAt(i));
        }
        return result.toString();
    }


}
