package General;

import java.math.BigInteger;
public class AddBinary {
    public static void main(String[] args){
        Solution45 sol = new Solution45();
        String a = "11";
        String b = "10110101010101010101010101010101010100101010101010101010101010101010101010101010101010101010101010";

        String result = sol.addBinary(a, b);
        System.out.println(result);
        System.out.println(result.length());
    }
}


class Solution45 {

    // public static long returnInt(long binary){
    //     long n = 0;
    //     long value = 0;

    //     if(binary == 0){
    //         return 0;
    //     }

    //     while(binary > 0){
    //         long temp = binary % 10;
    //         value += temp * Math.pow(2,n);
    //         binary = binary / 10;
    //         n++;
    //     }

    //     return value;
    // }

    // public static string returnBinaryString(int decimal){
    //     return Integer.toBinaryString(decimal);
    // }

    public String addBinary(String a, String b) {

        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder sumBuilder = new StringBuilder();

        while(i >= 0 && j >= 0){
            int x = a.charAt(i) - '0';
            int y = b.charAt(j) - '0';

            i--; j--;
            int sum = x + y + carry;
            carry = sum / 2;
            sum = sum % 2;

            sumBuilder.insert(0, sum);
        }

        while(i >= 0 && j != 0){
            int x = a.charAt(i) - '0';
            i--;

            int sum = x + carry;
            carry = sum / 2;
            sum = sum % 2;

            sumBuilder.insert(0, sum);
        }

        while(j >= 0 && i != 0){
            int x = b.charAt(j) - '0';
            j--;

            int sum = x + carry;
            carry = sum / 2;
            sum = sum % 2;

            sumBuilder.insert(0, sum);
        }

        if(carry == 1){
            sumBuilder.insert(0, 1);
            carry = 0;
        }

        return sumBuilder.toString();

        /*---------------------Working Solution below---------------------*/

        // BigInteger numberA = new BigInteger(a, 2);
        // BigInteger numberB = new BigInteger(b, 2);

        // BigInteger numberC = numberA.add(numberB);

        // String result = numberC.toString(2);
        // return result;

        /*---------------------Working Solution above---------------------*/

        // long valueA = returnInt(Long.parseLong(a));
        // long valueB = returnInt(Long.parseLong(b));

        // // System.out.println(valueA);
        // // System.out.println(valueB);

        // long valueC = valueA + valueB;
        // System.out.println(valueC);

        // String result = Long.toBinaryString(valueC);

        // return result;
        // long decimalA = Long.parseLong(a, 2);
        // long decimalB = Long.parseLong(b, 2);

        // long decimalSum = decimalA + decimalB;

        // String binarySum = Long.toBinaryString(decimalSum);

        // return binarySum;
    }
}