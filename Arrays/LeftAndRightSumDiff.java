import java.lang.Math;
class Solution16 {
    public static int leftSumImpl(int[] array, int index){
        int sum = 0;
        if(index < 0){
            return 0;
        }
        else{
            return array[index] + leftSumImpl(array, index-1);
        }
    }
    public static int rightSumImpl(int[] array, int index){
        int sum = 0;
        if(index == array.length){
            return 0;
        }
        else{
            return array[index] + rightSumImpl(array, index+1);
        }
    }
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            answer[i] = Math.abs(leftSumImpl(nums, i-1) - rightSumImpl(nums, i+1));
        }
        System.gc();
        return answer;
    }
}