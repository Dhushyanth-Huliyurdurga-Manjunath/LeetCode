import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution102{
    public int[] twoSum(int[] nums, int target){
        ArrayList<Integer> numberArray = IntStream.of(nums).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> alreadySeen = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(!alreadySeen.contains(numberArray.get(i))){
                alreadySeen.add(numberArray.get(i));
                numberArray.remove(i);    
            }
            int complement = Math.abs(target - numberArray.get(i));
            if(numberArray.contains(complement)){
                return new int[] {i, numberArray.indexOf(complement)};
            }
        }
        
        return null;
    }
}

public class TwoSum{
    public static void main(String[] args){
        Solution102 sol = new Solution102();
        int[] nums = {2, 7, 11, 15};
        
        int[] result = sol.twoSum(nums, 9);
        for(int i: result){
            System.out.println(i+" ");
        }
    }
}