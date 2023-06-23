class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(String sentence: sentences){
            String[] words = sentence.split(" ");
            int length = words.length;
            if(max < length){
                max = length;
            }
        }
        System.gc();
        return max;
    }
}