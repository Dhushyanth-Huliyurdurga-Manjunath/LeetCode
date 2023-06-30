class Solution {
    public boolean isPalindrome(int x) {
        int palindrome = 0;
        int copyX = x;

        while(x > 0){
            palindrome = palindrome*10 + (x%10);
            x = x/10;
        }

        return palindrome == copyX;
    }
}