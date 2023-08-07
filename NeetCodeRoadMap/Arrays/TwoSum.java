package NeetCodeRoadMap.Arrays;

import java.util.HashMap;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/7/23 04:07 PM
 */

public class TwoSum {
    public static void main(String[] args){
        Solution69 sol = new Solution69();
        int[] nums = {2, 7, 11, 15};
        
        int[] result = sol.twoSum(nums, 9);
        for(int i: result){
            System.out.println(i+" ");
        }
    }
}

class Solution69 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> alreadySeen = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++){
            int value = target - nums[i]; 
            if(alreadySeen.containsKey(value)){
                return new int[] {i, alreadySeen.get(value)};
            }
            else{
                alreadySeen.put(nums[i], i);
            }
        }   

        return null; 
    }
}