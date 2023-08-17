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
}