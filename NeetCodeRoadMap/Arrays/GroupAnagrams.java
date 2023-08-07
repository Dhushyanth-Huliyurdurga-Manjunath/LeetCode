package NeetCodeRoadMap.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/7/23 04:52 PM
 */

public class GroupAnagrams {
    public static void main(String[] args){
        Solution70 sol = new Solution70(); 

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = new ArrayList<>();

        result = sol.groupAnagrams(strs);

        System.out.println(result);
    }
}


class Solution70 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>(); 

        for(String s: strs){
            char[] characters = s.toCharArray(); 
            Arrays.sort(characters);
            String str = Arrays.toString(characters);

            if(!result.containsKey(str)){
                result.put(str, new ArrayList<>());
            }

            result.get(str).add(s);
        }

        return new ArrayList<>(result.values());

        // List<List<String>> result = new ArrayList<>(); 

        // if(strs.length == 1){
        //     result.add(Arrays.asList(strs[0])); 
        //     return result; 
        // }
        // else{
        //     Arrays.sort(strs);

        //     for(int i = 0; i < strs.length; i++){
        //         List<String> list = new ArrayList<>();
        //         String s = strs[i];

        //         boolean isElementPresent = result.stream()
        //         .flatMap(List::stream) // Flatten the inner lists
        //         .anyMatch(element -> element == s);

        //         if(!isElementPresent){
        //             list.add(strs[i]);
        //             for(int j = i + 1; j < strs.length; j++){
        //                 if(validAnagram(strs[i], strs[j])){
        //                         list.add(strs[j]);
        //                 }
        //             }
        //         result.add(list);
        //         }
        //     }
        // }

        // return result; 
    }
}