public class ReverseInteger {
    public static void main(String[] args){
        Solution58 sol = new Solution58();
        int result = sol.reverse(-65116115);

        System.out.println(result);
    }
}


class Solution58 {
    public int reverse(int x) {
        int result = 0;
        int xCopy = Math.abs(x);

        while(xCopy > 0){
            result = (result * 10) + (xCopy % 10);
            xCopy = xCopy / 10;

            if(result > Integer.MAX_VALUE / 10 && xCopy != 0)
                return 0;
        }

        return x < 0 ? -result:result;
    }
}