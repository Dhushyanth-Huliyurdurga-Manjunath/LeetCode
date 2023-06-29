class Solution {
    public int minMoves2(int[] nums) {
        int size = nums.length;
        int moves = 0;
        int medianIdx = 0;

        Arrays.sort(nums);

        if(size %2 == 0)
            medianIdx = size/2;
        else
            medianIdx = (int)Math.ceil(size/2);

        for(int i = 0; i < size; i++){
            moves = moves + Math.abs(nums[i]-nums[medianIdx]);
        }
        return moves;
    }
}