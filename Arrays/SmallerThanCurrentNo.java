class Solution25 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
    
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    if(nums[i] > nums[j]){
                        count[i] += 1;                    
                    }
                }
            }
        }

        return count;
    }
}