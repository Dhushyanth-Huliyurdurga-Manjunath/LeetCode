class Solution36 {
    public int numJewelsInStones(String jewels, String stones) {
        int numberOfStones = 0;

        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(jewels.charAt(j) == stones.charAt(i))
                    numberOfStones += 1;
            }
        }

        return numberOfStones;
    }
}