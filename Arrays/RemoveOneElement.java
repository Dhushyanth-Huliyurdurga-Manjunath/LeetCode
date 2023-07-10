import java.util.*;
class Solution23 {
    public boolean canBeIncreasing(int[] nums) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i: nums){
            array.add(i);
        }

        ArrayList<Integer> arrayCopy = new ArrayList<>(array);
        for(int i = 0; i < arrayCopy.size()-1; i++){
            if(arrayCopy.get(i) < arrayCopy.get(i+1)){
                continue;
            }
            else{

                arrayCopy.remove(i+1);
                boolean result1 = Sorted(arrayCopy);
                arrayCopy.add(i+1, array.get(i+1));
                arrayCopy.remove(i);
                boolean result2 = Sorted(arrayCopy);

                return result1 || result2;
            }
        }
        return true;
    }
    public boolean Sorted(ArrayList<Integer> array){
        for(int i = 0; i < array.size()-1; i++){
            if(array.get(i) < array.get(i+1))
                continue;
            else
                return false;
        }
        return true;
    }
}   