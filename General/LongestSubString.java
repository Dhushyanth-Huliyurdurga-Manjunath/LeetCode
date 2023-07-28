package General;

import java.util.*;

public class LongestSubString {
    public static void main(String[] args){
        Solution43 sol = new Solution43();
        int result = sol.lengthOfLongestSubstring("au");

        System.out.println(result);
    }
}

class Solution43 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            int count = 0;
            HashSet<String> hashSet = new HashSet<String>();
            for(int j = i; j < s.length(); j++){
                if(!hashSet.contains(String.valueOf(s.charAt(j)))){
                    hashSet.add(String.valueOf(s.charAt(j)));
                    count += 1;
                }
                else{
                    if(count > maxLength)
                        maxLength = count;
                    break;
                }
            }
        }

        return maxLength;
    }
}
