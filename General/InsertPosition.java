class Solution41 {
    public int searchInsert(int[] nums, int target) {
        int position = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            else if(target > nums[i]){
                position = i+1;
            }
        }

        return position;
    }
}

public class InsertPosition{
    public static void main(String[] args){
        Solution41 sol = new Solution41();
        int[] nums = {1, 3, 5, 6};

        int result = sol.searchInsert(nums, 5);
        System.out.println(result);
    }
}