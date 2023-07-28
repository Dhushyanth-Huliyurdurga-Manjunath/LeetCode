class Solution40 {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0, k = 0; 

        int count = 0;
        while(i < haystack.length() ){
            if(needle.charAt(j) == haystack.charAt(i)){
                if(j == 0)
                    k = i;
                j++;
                count++;
                i++;
            }
            else{
                i++;
                j = 0;
                count = 0;
            }
            if(count == needle.length())
                return k;
        }

        return -1;
    }
}

public class FirstOccurrence{
    public static void main(String[] args){
        Solution40 sol = new Solution40();

        String hayStack = "mississippi";
        String needle = "issip";

        int output = sol.strStr(hayStack, needle);
        System.out.println(output);
    }
}

