package General;

import Algorithms.QuickSort;
class Solution36 {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for(int i = 1; i < nums.length-1; i++){
            if(nums[i-1] == nums[i]){
                nums[i] = nums[i+1];
                k++;
            }
            else
                k++;
        }

        return k;
    }
}
public class RemoveDuplicates {
    public static void main(String[] args){
        Solution36 objSol = new Solution36();
        int[] nums = {0,2,2,0,1,3,1,1,3,4};

        QuickSort obj = new QuickSort();
        int[] sortedNums = obj.returnSortedArray(nums, 0, nums.length-1);

        for (int n :
                sortedNums) {
            System.out.print(n+" ");
        }

//        int k = objSol.removeDuplicates(nums);
//        System.out.println(k);
    }
}


