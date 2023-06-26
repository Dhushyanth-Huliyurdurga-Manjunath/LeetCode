class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();

        for(int i = 0; i < s.length(); i++){
            String character = Character.toString(s.charAt(i));
            if(hashMap1.containsKey(character)){
                hashMap1.put(character, hashMap1.get(character)+1);
            }
            else{
                hashMap1.put(character, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            String character = Character.toString(t.charAt(i));
            if(hashMap2.containsKey(character)){
                hashMap2.put(character, hashMap2.get(character)+1);
            }
            else{
                hashMap2.put(character, 1);
            }
        }

        return hashMap1.equals(hashMap2);
        

        // Set<String> setS = new HashSet<String>();
        // Set<String> setT = new HashSet<String>();

        // for(int i = 0; i < s.length(); i++){
        //     setS.add(Character.toString(s.charAt(i)));
        // }
        // for(int i = 0; i < t.length(); i++){
        //     setT.add(Character.toString(t.charAt(i)));
        // }

        // return setS.equals(setT) && s.length() == t.length();
        
        // while(i < s.length() && j >=0){
        //     System.out.println(s.charAt(i)+" "+t.charAt(j));
        //     if(s.charAt(i) == t.charAt(j)){
        //         continue;
        //     }
        //     else
        //         return false;
        // }

        // return true;
    }
}