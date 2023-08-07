package NeetCodeRoadMap.Arrays;
import java.util.Arrays;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/7/23 03:47 PM
 */


public class ValidAnagram {
    public static void main(String[] args){
        Solution68 sol = new Solution68(); 
        String s = "anagram"; 
        String t = "nagaram"; 

        boolean isAnagram = sol.isAnagram(s, t); 

        System.out.println(isAnagram);
    }
}

class Solution68 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false; 
        }

        char[] string1 = s.toCharArray(); 
        char[] string2 = t.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2); 

        for(int i = 0; i < string1.length; i++){
            if(string1[i] != string2[i]){
                return false;
            }
        }

        return true; 
    }
}