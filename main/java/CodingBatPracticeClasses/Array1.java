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
}