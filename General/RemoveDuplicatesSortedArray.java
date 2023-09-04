package General;

public class RemoveDuplicatesSortedArray {
    Solution78 sol = new Solution78(); 

    int[] array = {0, 0, 1, 1, 1 ,2 ,2 ,3 ,3 , 4};

    int k = sol.removeDuplicates(array); 
//    System.out.println(k);
}

class Solution78 {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1; 

        while(j < nums.length){
            if(nums[i] == nums[j] || nums[j] < nums[i]){
                j++;
            }
            else{
                int temp = nums[i]; 
                nums[i+1] = nums[j]; 
                i++; 
                j++;
            }
        }

        return i + 1;
    }
}