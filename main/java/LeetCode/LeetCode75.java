package LeetCode;

public class LeetCode75 {
    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int n = word1.length()+word2.length();
        for(int i = 0; i < n; i++) {
            if(i <= word1.length()-1)
                result += word1.charAt(i);
            if(i <= word2.length()-1)
                result += word2.charAt(i);
        }
        return result;
    }
    public int maxProductDifference(int[] nums) {
        return 0;
    }

    public static String gcdOfString(String str1, String str2) {
        // str1 is larger and str2 is smaller..
        // str1 is a concat of itself. IE ABABABAB...
        // The greatest common divisor is between BOTH str1 and str2. What substring can go into both equally.
        boolean isGCD = false;
        String GCD = "";
        StringBuilder t = new StringBuilder();
        while(!isGCD) {
            if(!str1.contains(str2)) {
                for(int i=0; i < str2.length()-1; i++)
                    GCD += str2.charAt(i);
            }
            isGCD = true;
        }
        return GCD;
    }
}