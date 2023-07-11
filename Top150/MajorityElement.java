import java.util.*;
class Solution37 {
    public int majorityElement(int[] nums) {
        int count = (int)Math.floor(nums.length/2);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: nums){
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        for(int i: hashMap.keySet()){
            if(hashMap.get(i) > count)
                return i;
        }

        return 0;
    }
}