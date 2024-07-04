package CodingBatPracticeClasses;

public class Array1 {

    /* Given an int array length 2, return true if it does not contain a 2 or 3.
    no23([4, 5]) → true
    no23([4, 2]) → false
    no23([3, 5]) → false */
    public  static boolean no23(int[] nums) {
        boolean result = true;
        if(nums[0] ==2 || nums[0] ==3 || nums[1] ==2 || nums[1] ==3)
            result = false;
        return result;
    }

    /* Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3] */
    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length*2];
        result[result.length-1] = nums[nums.length-1];
        return result;
    }

    /* Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false */
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
    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];
        result[0] = a[0];
		result[1] = a[1];
		result[2] = b[0];
		result[3] = b[1];
		return result;
    }

    
    /* Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    swapEnds([1, 2, 3]) → [3, 2, 1]
    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8] */
    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
          nums[0] = nums[nums.length-1];
          nums[nums.length-1] = temp;
          return nums;
    }
    
    /* Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3] */
    public static int[] midThree(int[] nums) {
        int[] result = new int[3];
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                
            }
        }
        return result;
   }
   
   /* Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
    maxTriple([1, 2, 3]) → 3
	maxTriple([1, 5, 3]) → 5
	maxTriple([5, 2, 3]) → 5 */
    
    
    // 0,1,2 / 3
    // 0,1,2,3,4 / 5
    // 0,1,2,3,4,5,6 / 7
    // 0,1,2,3,4,5,6,7,8 / 9
    
   public static int maxTriple(int[] nums) {
	   int result = 0;
	   int first = nums[0];
	   int last = nums[nums.length-1];
	   int middle = 0;
	   
	   if(nums.length == 3)
		   middle = nums[1];
	   else if(nums.length == 5)
		   middle = nums[2];
	   else {
		   middle = nums[nums.length-3-1];
	   }
	   
	   if (first > middle && first > last)
		   result = first;
	   else if (middle > first && middle > last)
		   result = middle;
	   else
		   result = last;
	   
	   return result;
   }

    /* Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
    frontPiece([1, 2, 3]) → [1, 2]
    frontPiece([1, 2]) → [1, 2]
    frontPiece([1]) → [1]*/

    public static int[] frontPiece(int[] nums) {
        switch (nums.length) {
            case 0:
                return nums;
            case 1:
                return new int[] {nums[0]};
            default:
                return new int[] {nums[0], nums[1]};
        }
    }

    /* We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        unlucky1([1, 3, 4, 5]) → true
        unlucky1([2, 1, 3, 4, 5]) → true
        unlucky1([1, 1, 1]) → false*/

    public static boolean unlucky1(int[] nums) {
        if(nums.length >= 2)
            if (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3 || nums[nums.length-2] == 1 && nums[nums.length-1] == 3)
                return true;
            else
                return false;
        return false;
    }

    /* Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b.
        The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
        make2([4, 5], [1, 2, 3]) → [4, 5]
        make2([4], [1, 2, 3]) → [4, 1]
        make2([], [1, 2]) → [1, 2]*/
    
    public static int[] make2(int[] a, int[] b) {
    	switch (a.length) {
    		case 2:
    			return new int[]{a[0],a[1]};
    		case 1:
    			return new int[]{a[0],b[0]};
    	};
    	
    	
    	
    	
    	int[] n = new int[2];
    	if(a.length >= 2) {
    		n[0] = a[0];
    		n[1] = a[1];
    	}
    	else if(a.length == 1) {
    		n[0] = a[0];
    		n[1] = b[0];
    	}
    	else {
    		n[0] = b[0];
    		n[1] = b[1];
    	}
    	
    	return n;   	
    }

}






