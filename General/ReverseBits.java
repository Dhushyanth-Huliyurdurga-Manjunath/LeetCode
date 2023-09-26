package General;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 9/25/23 7:11 PM
 */

/**
 * Reverse bits of a given 32 bits unsigned integer.
 */
public class ReverseBits {
    public static void main(String[] args){
        int[] inputArray = {-3, 43261596 };

        for(int n: inputArray){
            Solution80 sol = new Solution80();
            int result = sol.reverseBits(n);
        }
    }
}

class Solution80 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0, idx = 1;
        String str = Integer.toBinaryString(n);
        while (str.length() < 32) {
            str = "0" + str; // Pad with leading zeros
        }

        String unsignedInt32Bit = str;
        Long unsignedInt32 = Long.parseLong(unsignedInt32Bit, 2);
        System.out.println("Input: "+unsignedInt32+" ("+unsignedInt32Bit+")");

        StringBuilder s = new StringBuilder();
        for(int i = 0; i <= unsignedInt32Bit.length() - 1; i++){
            s.insert(0, unsignedInt32Bit.charAt(i));
            int val = Character.getNumericValue(unsignedInt32Bit.charAt(i));
            result += val * idx;
            idx *= 2;
        }

        StringBuilder outputBinaryForm = new StringBuilder(Integer.toBinaryString(result));
        while(outputBinaryForm.length() < 32){
            outputBinaryForm.insert(0, "0");
        }

        System.out.println("Output: "+Long.parseLong(String.valueOf(s), 2)+" ("+outputBinaryForm+")");
        return result;
    }
}
