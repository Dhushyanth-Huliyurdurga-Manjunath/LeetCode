import java.util.List;
import java.util.Collections;
import java.util.*;
class Solution10 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        // return Ints.toArray(target);
        int[] target = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            target[i] = list.get(i);
        }
        return target;
        // return target.stream().mapToInt(Integer::intValue).toArray();
    }
}