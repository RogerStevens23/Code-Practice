package CodingBatPracticeClasses;

import java.util.Arrays;
import java.util.Comparator;

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

}