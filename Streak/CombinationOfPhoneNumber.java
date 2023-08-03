
import java.util.*;
public class CombinationOfPhoneNumber{
    public static void main(String[] args){
        Solution67 sol = new Solution67();

        List<String> result = sol.letterCombinations("234345");

        System.out.println(result);
    }
}

class Solution67 {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, List<String>> hashMap = new HashMap<Integer, List<String>>();
        hashMap.put(2, new ArrayList(Arrays.asList("a", "b", "c")));
        hashMap.put(3, new ArrayList(Arrays.asList("d", "e", "f")));
        hashMap.put(4, new ArrayList(Arrays.asList("g", "h", "i")));
        hashMap.put(5, new ArrayList(Arrays.asList("j", "k", "l")));
        hashMap.put(6, new ArrayList(Arrays.asList("m", "n", "o")));
        hashMap.put(7, new ArrayList(Arrays.asList("p", "q", "r", "s")));
        hashMap.put(8, new ArrayList(Arrays.asList( "t", "u", "v")));
        hashMap.put(9, new ArrayList(Arrays.asList("w", "x", "y", "z")));
        

        List<String> result = new ArrayList<String>();

        if(digits.equals("")){
            return result;
        }

        int[] digitArray = new int[digits.length()];
        int digit = Integer.parseInt(digits); 
        int idx = 0;

        while(digit > 0){
            digitArray[idx] = digit % 10; 
            if(result.isEmpty()){
                result.addAll(hashMap.get(digitArray[idx]));
            }
            else{
                List<String> temp = new ArrayList<>(result);
                for(String s:  hashMap.get(digitArray[idx])){
                    for(String t: temp){
                        result.add(s.concat(t));
                    }
                }
                result.removeAll(temp);
            }
            digit /= 10;
            idx++;
        }

        return result;
    }
}