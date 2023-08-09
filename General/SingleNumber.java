public class SingleNumber {
    public static void main(String[] args){
        Solution72 sol = new Solution72(); 
        int[] nums = {4, 1, 2, 1, 2};

        int result = sol.singleNumber(nums);
        System.out.println(result);
    }
}

class Solution72 {
    public int singleNumber(int[] nums) {
        int result = 0; 

        for(int i: nums){
            result = result ^ i;
        }

        return result; 
    }
}