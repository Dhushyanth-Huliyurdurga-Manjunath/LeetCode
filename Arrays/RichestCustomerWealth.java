class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] temp: accounts){
        int total = 0;
            for(int money: temp){
                total += money;
                if(max < total){
                    max = total;
                }
            }
        }
        System.gc();
        return max;
    }
}