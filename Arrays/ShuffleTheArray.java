class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] tempArray = new int[2*n];
        tempArray[0] = nums[0];
        for(int i = 1; i < 2*n; i++){
            if(i%2 == 0){
                tempArray[i] = nums[i/2];
            }
            else{
                tempArray[i] = nums[n+(i-1)/2];
            }
        }
        System.gc();
        return tempArray;
    }
}