class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] tempArray = new int[2*n];
        int x = 0;
        int y = 0;
        for(int i = 0; i < 2*n; i+=2){
            tempArray[i] = nums[x];
            x++;
            tempArray[i+1] = nums[y+n];
            y++;
        }
        System.gc();
        return tempArray;
    }
}