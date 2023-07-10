import java.util.List;

import java.util.*;
class Solution24 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> greatestCandies = new ArrayList<Boolean>();

        for(int i = 0; i < candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }   

        for(int i = 0; i < candies.length; i++){
            if(candies[i]+extraCandies >= max){
                greatestCandies.add(true);
            }
            else{
                greatestCandies.add(false);
            }
        }

        return greatestCandies;
    }
}