package Algorithms;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/20/23 8:24 PM
 */

/**
* Given an array of integers nums which is sorted in ascending order,
* and an integer target, write a function to search target in nums.
*  If target exists, then return its index. Otherwise, return -1.*/
public class BinarySearch {
    public static void main(String[] args){
        Solution78 sol = new Solution78();

        int[] nums = {-1, 0, 3, 5, 9, 12};

        int result = sol.search(nums, 9);
        System.out.println(result);

    }

}

class Solution78 {
    public int search(int[] nums, int target) {
        return binarySearch(nums.length - 1, 0, nums, target);
    }

    public static int binarySearch(int high, int low, int[] nums, int target){
        if(low > high){
            return -1;
        }
        int mid = (high + low) / 2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            low = mid + 1;
            return binarySearch(high, low, nums, target);
        }
        else if(nums[mid] > target){
            high = mid - 1;
            return binarySearch(high, low, nums, target);
        }
        return -1;
    }
}
