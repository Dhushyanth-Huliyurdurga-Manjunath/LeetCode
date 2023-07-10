import java.util.*;
import java.lang.Math;

class Solution33 {
    public int[] twoSum(int[] nums, int target) {
        // Vector<Integer> complement = new Vector<Integer>(Arrays.asList(nums));

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
        // HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        // for(int i = 0; i < nums.length; i++){
        //     if(hashMap.containsKey(nums[i])){
        //         hashMap.put(nums[i], hashMap.get(nums[i])+1);
        //     }
        //     else{
        //         hashMap.put(nums[i], 1);
        //     }
        // }

        // for(int i: hashMap.keySet()){
        //     int diff = Math.abs(i - target);
        //     // int idx = Arrays.binarySearch(nums,i);
        //     int idx = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[j] == i){
        //             idx = j;
        //             break;
        //         }
        //     }

        //     if(hashMap.containsKey(diff)){
        //         if(hashMap.get(i) > 1)
        //             return new int[] {idx, Arrays.binarySearch(nums,idx+1, nums.length, diff)}; 
        //         else
        //             return new int[] {idx, Arrays.binarySearch(nums, idx, nums.length, diff)}; 

        //     }
        // }
        // return new int[2];
        // Vector<Integer> complement = new Vector<>();
        //         for (int i = 0; i < nums.length; i++) {
        //             complement.add(nums[i]);
        //         }


        // Vector<Integer> complementCopy = new Vector<Integer>(complement);
        // for(int i = 0; i < complementCopy.size(); i++){
        //     int value = complementCopy.get(i);
        //     int diff = Math.abs(value - target);

        //     System.out.println(value);
        //     if(complementCopy.contains(diff) && complementCopy.indexOf(diff) != i){
        //         complementCopy.remove(i);
        //         return new int[] {complement.indexOf(value), complementCopy.indexOf(diff)+1};
        //     }
        // }

        // Iterator<Integer> iterator = complementCopy.iterator();
        // while(iterator.hasNext()){
        //     int value = iterator.next();
        //     int diff = Math.abs(value - target);
        //     complementCopy.remove(value);
        //     if(complement.contains(diff)){
        //         // return [complement.get(value), complement.get(diff)];

        //         return new int[] {complement.indexOf(value), complement.indexOf(diff)};
        //     }
        // }
    }
}