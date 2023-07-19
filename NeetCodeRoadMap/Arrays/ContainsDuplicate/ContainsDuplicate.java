import java.util.*;

public class ContainsDuplicate{
    public static void main(String[] args){
        Solution100 sol = new Solution100();
        int[] nums = {1, 2, 3, 1};

        boolean result = sol.containsDuplicate(nums);
        System.out.println(result);
    }
}

class Solution100 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i: nums){
            set.add(i);
        }

        return set.size() < nums.length;
    }
}