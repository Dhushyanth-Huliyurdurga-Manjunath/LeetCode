package General;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/14/23 12:38 AM
 */

/**
 * Given an integer columnNumber, return its corresponding
 * column title as it appears in an Excel sheet.
 */
public class ExcelColumnNumber {
    public static void main(String[] args){
        Solution76 sol = new Solution76();
        int columnNumber = 1033423;

        String result = sol.convertToTitle(columnNumber);
        System.out.println("Column Name: " + result);
    }
}

class Solution76 {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(columnNumber <= 26) {return Character.toString(letters.charAt(columnNumber - 1));}

        int col = columnNumber;

        while(col > 26){
            if((col % 26) == 0){
                sb.insert(0, letters.charAt(25));
                col = (int) Math.floor(col / 26);
                col = col - 1;
                continue;
            }
            else{
                sb.insert(0, letters.charAt((col % 26) - 1));
            }
            col = (int)Math.floor(col / 26);
        }

        sb.insert(0, letters.charAt(col - 1));

        return sb.toString();
    }
}
