class Solution8 {
    public boolean backspaceCompare(String s, String t) {
        String outputS = "";
        String outputT = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '#'){
                outputS += s.charAt(i);
            }
            else if(s.charAt(i) =='#' && outputS.length() != 0){
                outputS = outputS.substring(0, outputS.length() - 1);
            }
        }
        for(int j = 0; j < t.length(); j++){
            if(t.charAt(j) != '#'){
                outputT += t.charAt(j);
            }
            else if(t.charAt(j) == '#' && outputT.length() != 0){
                outputT = outputT.substring(0, outputT.length() - 1);
            }
        }
        System.gc();
        if(outputS.equals(outputT)){
            return true;
        }
        return false;
    }
}