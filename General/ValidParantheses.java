import java.util.*;

class Solution3 {
    public static Character returnCounterCharacter(Character a){
        
        if(a == ')')
            return '(';
        else if(a == ']')
            return '[';
        else if(a == '}')
            return '{';
        else return null;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        System.out.println(s);
        if(s.length() == 0 || s == null)
            return false;

        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(stack.peek() == returnCounterCharacter(s.charAt(i))){
                System.out.println(stack.peek()+" "+s.charAt(i));
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
            System.out.println(stack+" "+s.charAt(i));
            // System.out.println(stack.peek() == s.charAt(i));
        }

        // System.out.println(stack);
        // stack.pop();

        
        // System.out.println(stack);
        return stack.empty();
    }
}

public class ValidParantheses{
    public static void main(String[] args){
        Solution3 sol = new Solution3();

        System.out.println(sol.isValid("()"));
    }
}