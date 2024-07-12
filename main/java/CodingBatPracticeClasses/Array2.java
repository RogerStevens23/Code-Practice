package CodingBatPracticeClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2 {

    /* Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0 */
    public static int countEvens(int[] nums) {
        int result = 0;
        for (int n : nums)
            if (n % 2 == 0)
                result++;
        return result;
    }

    /* Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
        Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
        bigDiff([10, 3, 5, 6]) → 7
        bigDiff([7, 2, 10, 9]) → 8
        bigDiff([2, 10, 7, 2]) → 8 */

    public static int bigDiff(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int i=0; i<nums.length; i++) {
            if (i+1 < nums.length) {
                min = Math.min(min, nums[i+1]);
                max = Math.max(max, nums[i+1]);
            }
        }
        return max-min;
    }

    /* Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array.
        If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
        You may assume that the array is length 3 or more.
        centeredAverage([1, 2, 3, 4, 100]) → 3
        centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
        centeredAverage([-10, -4, -2, -4, -2, 0]) → -3 */

    public static int centeredAverage(int[] nums) {
        int max = nums[0], min = nums[0], sum = 0;
        for (int i=0; i<nums.length; i++) {
            if (i+1 < nums.length) {
                min = Math.min(min, nums[i + 1]);
                max = Math.max(max, nums[i + 1]);
            }
            sum += nums[i];
        }
        sum -= max;
        sum -= min;
        return sum/(nums.length-2);
    }

    /* Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
        so it does not count and numbers that come immediately after a 13 also do not count.
        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6 */

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 13) {
                nums[i] = 0;
                if(i+1 < nums.length)
                    nums[i+1] = 0;
            }
            sum += nums[i];
        }
        return sum;
    }

    /* Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7
        (every 6 will be followed by at least one 7). Return 0 for no numbers.
        sum67([1, 2, 2]) → 5
        sum67([1, 2, 2, 6, 99, 99, 7]) → 5
        sum67([1, 1, 6, 7, 2]) → 4 */

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean skip = false;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 6)
                skip = true;
            if (nums[i] == 7 && skip) {
                skip = false;
                nums[i] = 0;
            }
            if (!skip)
                sum += nums[i];
        }
        return sum;
    }

    /* Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
        has22([1, 2, 2]) → true
        has22([1, 2, 1, 2]) → false
        has22([2, 1, 2]) → false */
    public static boolean has22(int[] nums) {
        boolean result = false;
        for (int i=0; i<nums.length; i++) {
            if (i+1 < nums.length)
                if (nums[i] == 2 && nums[i+1] == 2)
                    result = true;
        }
        return result;
    }

    /* Given an array of ints, return true if the array contains no 1's and no 3's.
        lucky13([0, 2, 4]) → true
        lucky13([1, 2, 3]) → false
        lucky13([1, 2, 4]) → false */

    public static boolean lucky13(int[] nums) {
        boolean result = true;
        for (int n : nums)
            if (n == 1 || n == 3) {
                result = false;
                break;
            }
        return result;
    }

    /* Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
        sum28([2, 3, 2, 2, 4, 2]) → true
        sum28([2, 3, 2, 2, 4, 2, 2]) → false
        sum28([1, 2, 3, 4]) → false */

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n == 2)
                sum += n;
        }
        if (sum == 8)
            return true;
        else return false;
    }

    /* Given an array of ints, return true if the number of 1's is greater than the number of 4's
        more14([1, 4, 1]) → true
        more14([1, 4, 1, 4]) → false
        more14([1, 1]) → true */

    public static boolean more14(int[] nums) {
        int count1 = 0, count4 = 0;
        for (int n : nums) {
            if (n == 1)
                count1++;
            if (n == 4)
                count4++;
        }
        return count1 > count4;
    }

    /* Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0,
        in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally
        execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]
        fizzArray(4) → [0, 1, 2, 3]
        fizzArray(1) → [0]
        fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] */

    public static int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i=0; i<n; i++)
            result[i] = i;
        return result;
    }


    /* Given an array of ints, return true if every element is a 1 or a 4.
        only14([1, 4, 1, 4]) → true
        only14([1, 4, 2, 4]) → false
        only14([1, 1]) → true */

    public static boolean only14(int[] nums) {
        boolean result = true;
        for (int n : nums) {
            if (n == 1 || n == 4)
                result = true;
            else {
                result = false;
                break;
            }
        }
        return result;
    }

    /* Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1.
        N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types.
        The syntax to make a new string array is: new String[desired_length]
        fizzArray2(4) → ["0", "1", "2", "3"]
        fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        fizzArray2(2) → ["0", "1"]*/

    public static String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i=0; i<n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

    /* Given an array of ints, return true if it contains no 1's, or it contains no 4's.
        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true */

    public static boolean no14(int[] nums) {
        boolean has1 = false, has4 = false;
        for (int n: nums) {
            if (n == 1)
                has1 = true;
            if (n == 4)
                has4 = true;
        }
        return !has1 || !has4;
    }

    /* We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value.
    Return true if the given value is everywhere in the array.
        isEverywhere([1, 2, 1, 3], 1) → true
        isEverywhere([1, 2, 1, 3], 2) → false
        isEverywhere([1, 2, 1, 3, 4], 1) → false */

    public static boolean isEverywhere(int[] nums, int val) {
        int pairTrue = 0;
        if (nums.length != 0) { // Returns true with a zero count array. Part of one of the tests but according to the prompt I believe this should return false.
            for (int i=0; i<nums.length-1; i++)
                //if(i+1 < nums.length)
                    if (nums[i] == val && nums[i + 1] != val || nums[i] != val && nums[i + 1] == val || nums[i] == val && nums[i + 1] == val)
                        pairTrue++;
            return pairTrue == nums.length-1;
        }
        else return true; // above comment explains this ^^^.
    }

    /* Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
        either24([1, 2, 2]) → true
        either24([4, 4, 1]) → true
        either24([4, 4, 1, 2, 2]) → false */

    public static boolean either24(int[] nums) {
        boolean is2pair = false, is4pair = false;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                is2pair = true;
            else if (nums[i] == 4 && nums[i + 1] == 4)
                is4pair = true;
        }
        return (is2pair || is4pair) && !(is2pair && is4pair);
    }



    /* Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
        Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
        matchUp([1, 2, 3], [2, 3, 10]) → 2
        matchUp([1, 2, 3], [2, 3, 5]) → 3
        matchUp([1, 2, 3], [2, 3, 3]) → 2*/

    public static int matchUp(int[] nums, int[] nums2) {
        return 0;
    }
}











