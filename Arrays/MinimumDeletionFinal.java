import java.util.*;
class Solution14 {
    public int minDeletions(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // HashMap<Integer, String> valueMap = new HashMap<>();

        char[] characters = s.toCharArray();
        int charsToBeDelete = 0;

        for (char c : characters) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        HashSet<Integer> hashMapCopy = new HashSet<>();

        for(int frequency: hashMap.values()){
            while (frequency > 0 && hashMapCopy.contains(frequency)){
                charsToBeDelete++;
                frequency--;
            }
            hashMapCopy.add(frequency);
        }

        // HashMap<Character, Integer> hashMapCopy = new HashMap<>(hashMap);
        // for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
        //     int value = entry.getValue();
        //     hashMapCopy.remove(entry.getKey());
        //     while (hashMapCopy.containsValue(entry.getValue())) {
        //         charsToBeDelete += 1;
        //         value--;
        //         hashMapCopy.put(entry.getKey(), value);
        //     }
        // }

        // for(Map.Entry<Character, Integer> entry : hashMap.entrySet()){
        // if(valueMap.containsKey(entry.getValue())){
        // valueMap.put(entry.getValue(),
        // String.valueOf(entry.getKey()).concat(valueMap.get(entry.getValue())));
        // }
        // else
        // valueMap.put(entry.getValue(), String.valueOf(entry.getKey()));
        // }

        // for(String a: valueMap.values()){
        // if(a.length() == 2 &&
        // !valueMap.containsKey((int)hashMap.get(a.charAt(0))-1)){
        // // charsToBeDelete = hashMap.get(a.charAt(0)) - 1;
        // charsToBeDelete += 1;
        // // System.out.println(valueMap.containsKey(hashMap.get(a.charAt(0))));
        // }
        // else if(a.length() == 2 &&
        // valueMap.containsKey((int)hashMap.get(a.charAt(0))-1)){
        // // System.out.println(valueMap.containsKey(hashMap.get(a.charAt(0)) - 1));
        // // charsToBeDelete = hashMap.get(a.charAt(0)) - 2;
        // charsToBeDelete += 2;
        // }
        // else if(a.length() == 3 &&
        // !valueMap.containsKey((int)hashMap.get(a.charAt(0))-1)){
        // // System.out.println(valueMap.containsKey(hashMap.get(a.charAt(0)) - 1));
        // // charsToBeDelete = hashMap.get(a.charAt(0)) - 2;
        // charsToBeDelete += hashMap.get(a.charAt(0))+1;
        // }
        // else if(a.length() == 4 &&
        // !valueMap.containsKey((int)hashMap.get(a.charAt(0))-1)){
        // // System.out.println(valueMap.containsKey(hashMap.get(a.charAt(0)) - 1));
        // // charsToBeDelete = hashMap.get(a.charAt(0)) - 2;
        // charsToBeDelete += hashMap.get(a.charAt(0))+2;
        // }
        // }
        // System.out.println(valueMap);
        return charsToBeDelete;
    }
}