class Solution7 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer string1 = new StringBuffer();
        StringBuffer string2 = new StringBuffer();

        for(String s: word1){
            string1.append(s);
        }
        for(String s: word2){
            string2.append(s);
        }

        return string1.toString().equals(string2.toString());
    }
}