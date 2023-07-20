import java.util.*;

public class DecodeTheMessage{
    public static void main(String[] args){
        Solution55 sol = new Solution55();
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        
        String output = sol.decodeMessage(key, message);
        System.out.println(output);
    }
}

class Solution55 {
    public String decodeMessage(String key, String message) {
        StringBuffer result = new StringBuffer();
        HashMap<Character, Character> hashKey = new HashMap<Character, Character>();
        int ascii = 97;

        hashKey.put(' ', ' ');

        for(int i = 0; i < key.length(); i++){
            if(key.charAt(i) != ' ' && !hashKey.containsKey(key.charAt(i))){
                hashKey.put(key.charAt(i), (char)ascii);
                ascii++;
            }
            if(ascii == 123){
                break;
            }
        }

        for(int i = 0; i < message.length(); i++){
            result.append(hashKey.get(message.charAt(i)));
        }

        return result.toString();
    }
}