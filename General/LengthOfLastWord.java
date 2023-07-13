public class LengthOfLastWord {
    public static void main(String[] args){
        Solution46 sol = new Solution46();
        String str = "   fly me   to   the moon  ";
        
        int result = sol.lengthOfLastWord(str);
        System.out.println(result);
    }
}

class Solution46 {
    public int lengthOfLastWord(String s) {
        String subString = "";
        boolean lastCharWasSpace = false;

        subString += s.charAt(0);
        if(subString.charAt(0) == ' ')
            lastCharWasSpace = true;


        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != ' ' && !lastCharWasSpace){
                subString += s.charAt(i);
            }
            else if(s.charAt(i) !=' ' && lastCharWasSpace){
                subString = "";
                subString = String.valueOf(s.charAt(i));
                lastCharWasSpace = false;
            }
            else if(s.charAt(i) == ' '){
                lastCharWasSpace = true;
                continue;
            }
            else{
                subString = "";
            }
        }

        return subString.length();
    }
}
