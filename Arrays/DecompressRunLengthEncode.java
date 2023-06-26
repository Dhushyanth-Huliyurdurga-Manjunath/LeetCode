class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length/2; i++){
            int freq = nums[2*i];
            int val = nums[2*i+1];
            for(int j = 0; j < freq; j++){
                list.add(val);
            }    
        }

        int[] decompressedList = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            decompressedList[i] = list.get(i);
        }
        
        System.gc();
        return decompressedList;
    }
}