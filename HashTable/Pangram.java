import java.util.*;

public class Pangram{
    public static void main(String[] args){
        Solution56 sol = new Solution56();
        String senetence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = sol.checkIfPangram(senetence);
        System.out.println(result);
    }
}

class Solution56 {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hashSet = new HashSet<Character>();

        for(int i = 0; i < sentence.length(); i++){
            hashSet.add(sentence.charAt(i));
        }

        return hashSet.size() == 26;
    }
}