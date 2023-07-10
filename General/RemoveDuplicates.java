package General;

import Algorithms.QuickSort;
class Solution36 {
    public int removeDuplicates(int[] nums) {
        int k = 0;

//        for(int i = 1; i < nums.length-1; i++){
//            if(nums[i-1] == nums[i]){
//                nums[i] = nums[i+1];
//                k++;
//            }
//            else
//                k++;
//        }
        k = partition(nums, 0, nums.length-1);
        for(int i = 0; i < k; i++){
            System.out.print(nums[i]+ " ");
        }
        return k;
    }

    public int partition(int[] array, int low, int high){
        int pivot = array[low];
        int i = low - 1;
        int j;

        for(j = low; j < high-1; j++){
            if(array[j] == array[j+1]){
                i++;
                swap(array, j+1, i);
            }
        }

        swap(array, i+1, j);
        return i+1;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
public class RemoveDuplicates {
    public static void main(String[] args){
        Solution36 objSol = new Solution36();
//        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

//        QuickSort obj = new QuickSort();
//        int[] sortedNums = obj.returnSortedArray(nums, 0, nums.length-1);
//
//        for (int n :
//                sortedNums) {
//            System.out.print(n+" ");
//        }

        int k = objSol.removeDuplicates(nums);
//        System.out.println(k);
    }
}


