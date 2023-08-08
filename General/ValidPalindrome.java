 

public class ValidPalindrome{
    public static void main(String[] args){
        Solution71 sol = new Solution71();

        String s = "A man, a plan, a canal: Panama";

        boolean result = sol.isPalindrome(s);
        System.out.println(result);
    }
}

class Solution71 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(); 
        char[] ch = s.toCharArray(); 


        for(char c: ch){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        int i = 0, j = sb.length() - 1; 

        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true; 
    }
}