package General;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/14/23 1:23 PM
 */

 /**
  * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
  */

  public class ExcelColumnTitle{
    public static void main(String[] args){
        Solution77 sol = new Solution77();
        String columnTitle = "GITHUB";

        int result = sol.titleToNumber(columnTitle);
        System.out.println(result);
    }
  }

  class Solution77 {
    public int titleToNumber(String columnTitle) {
        int result = 0; 
        int idx = 1; 

        for(int i = columnTitle.length() - 1; i >= 0; i--){
            char c = columnTitle.charAt(i);
            result += (c - 'A' + 1) * idx;
            idx *= 26;
        }   

        return result; 
    }
}