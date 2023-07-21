import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args){
        Solution57 sol = new Solution57();
        String result = sol.intToRoman(1994);

        System.out.println(result);
    }
}

class Solution57 {
    public String concatenateString(int num, String s){
        String str = "";
        for(int i = 0; i < num; i++){
            // System.out.println(i+" "+str);
            str += s;
        }
            // System.out.println(s);
        return str;
    }
    public String returnRomanCharacter(int num, int place){
        String str = "";
        if(place == 1){
            if(num <= 3){
                str = concatenateString(num, "I");
                return str;
            }
            if(num == 4){
                return "IV";
            }
            if(num >= 5 && num < 9){
                str = "V";
                str += concatenateString(num-5, "I");
                return str;
            }
            if(num == 9){
                return "IX";
            }
        }
        if(place == 10){
            if(num <= 3){
                str = concatenateString(num, "X");
                return str;
            }
            if(num == 4){
                return "XL";
            }
            if(num >= 5 && num < 9){
                str = "L";
                str += concatenateString(num-5, "X");
                return str;
            }
            if(num == 9){
                return "XC";
            }
        }
        if(place == 100){
            if(num <= 3){
                str = concatenateString(num, "C");
                return str;
            }
            if(num == 4){
                return "CD";
            }
            if(num >= 5 && num< 9){
                str = "D";
                str += concatenateString(num-5, "C");
                return str;
            }
            if(num == 9){
                return "CM";
            }
        }
        if(place == 1000){
            str = concatenateString(num, "M");
        }
        return str;
    }
    public String intToRoman(int num) {
        StringBuffer result = new StringBuffer();
        List<Integer> digitPlaces = new ArrayList<Integer>();
        int numCopy = num;

        while(numCopy > 0){
            int temp = numCopy % 10;
            digitPlaces.add(temp);
            numCopy /= 10;
        }

        int multiply = 1;
        for(int i = 0; i < digitPlaces.size() ; i++){
            result.insert(0, returnRomanCharacter(digitPlaces.get(i), multiply));
            // System.out.println(result+" "+multiply);
            multiply *= 10;
        }
        // System.out.println(digitPlaces);
        return result.toString();
    }
}