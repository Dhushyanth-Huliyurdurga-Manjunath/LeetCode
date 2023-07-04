import java.util.Hashtable;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int numberOfStones = 0;
        HashMap<Character, Integer> stoneFrequency = new HashMap<>();
        HashMap<Character, Integer> jewelFrequency = new HashMap<>();

        for(int i = 0; i < stones.length(); i++){
            stoneFrequency.put(stones.charAt(i), stoneFrequency.getOrDefault(stones.charAt(i), 0) + 1);
        }

        // for(int i = 0; i < jewels.length(); i++){
        //     jewelFrequency.put(jewels.charAt(i), jewelFrequency.getOrDefault(jewels.charAt(i), 0) + 1);
        // }

        // System.out.println(stoneFrequency);
        // System.out.println(jewelFrequency);

        for(int i = 0; i < jewels.length(); i++){
            if(stoneFrequency.containsKey(jewels.charAt(i)))
                numberOfStones += stoneFrequency.get(jewels.charAt(i));
        }

        // for(char c: stoneFrequency.keySet()){
        //     if(jewelFrequency.containsKey(c))
        //         numberOfStones += stoneFrequency.get(c);
        // }

        // for(int i = 0; i < stones.length(); i++){
        //     if(stones.charAt())
        //     // for(int j = 0; j < jewels.length(); j++){
        //     //     if(jewels.charAt(j) == stones.charAt(i))
        //     //         numberOfStones += 1;
        //     // }
        // }

        return numberOfStones;
    }
}




//chatGPT solution
class solution2{
    public static int countJewels(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }
        
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }
        
        return count;
    }
}