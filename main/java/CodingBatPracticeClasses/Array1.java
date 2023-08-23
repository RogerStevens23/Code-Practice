package CodingBatPracticeClasses;

public class Array1 {
    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length*2];
        result[result.length-1] = nums[nums.length-1];
        return result;
    }
    public static boolean double23(int[] nums) {
        boolean result = false;
        if(nums.length != 0 && nums.length != 1) {
            if(nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3)
                result = true;
        }
        return result;
    }
    /* Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
    set the 3 element to 0. Return the changed array. */
    public static int[] fix23(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            if(i <= nums.length-1)
                if(nums[i] == 2 && nums[i+1] == 3)
                    nums[i+1] = 0;
        }
        return nums;
    }

    /* Start with 2 int arrays, a and b, of any length. 
    Return how many of the arrays have 1 as their first element. */
    public static int start1(int[] a, int[] b) {
        int result = 0;
        if(a.length > 0 && a[0] == 1)
            result++;
        if(b.length > 0 && b[0] == 1)
            result++;
        return result;
    }

    /* Given an array of ints of even length, return a new array length 2 containing the 
    middle two elements from the original array. The original array will be length 2 or more.
    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2] */

    public static int[] makeMiddle(int[] nums) {
        int[] result = new int[2];
        if(nums.length > 2) {
            result[0] = nums[(nums.length/2)-1];
            result[1] = nums[(nums.length/2)];
            return result;
        }
        else
            return nums;
    }

    /* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4] */
    public static int[] plusTwo(int[] a, b) {
        
    }
}