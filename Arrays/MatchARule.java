import java.util.*;
class Solution6 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match = 0;

        for(List<String> list: items){
            int count = 0;
            for(String item: list){
                if(ruleValue.equals(item)){
                    if(count == 0 && ruleKey.equals("type")){
                        match += 1;
                        break;
                    }
                    else if(count == 1 && ruleKey.equals("color")){
                        match += 1;
                        break;
                    }
                    else if(count == 2 && ruleKey.equals("name")){
                        match += 1;
                        break;
                    }
                }
                count++;
            }
        } 
        return match;
    }
}