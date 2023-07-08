class Solution {
    public long beautifulSubarrays(int[] nums) {
        long count = 0; 
        int xor = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);

        for(int i: nums){
            xor ^= i;
            count += (long)hashMap.getOrDefault(xor, 0);
            hashMap.put(xor, hashMap.getOrDefault(xor, 0) + 1);
        }


        // if(nums.length == 1){
        //     if((nums[0] ^ 0) == 0)
        //         return 1;
        //     else
        //         return 0;
        // }
        // // for(int i = 0; i < nums.length; i++){
        // int i = 0;
        // while(i < nums.length){
        //     int xor = 0;
        //     for(int j = i; j < nums.length; j++){
        //         xor ^= nums[j];
        //         // if(subArray(nums,  i, j) == 0){
        //             // count++;
        //             // System.out.println(i+" "+j+" "+subArray(nums,  i, j));
        //         // }
        //         if(xor == 0)
        //             count+=1;
        //         else
        //             continue;
        //     }
        //     i++;
        // }

        // while(true){
        // int xor = 0;
        // for(int j = 0; j < nums.length; j++){
        //     xor ^= nums[j];
        //         // if(subArray(nums,  i, j) == 0){
        //             // count++;
        //             // System.out.println(i+" "+j+" "+subArray(nums,  i, j));
        //         // }
        //     if(xor == 0){
        //         count+=1;
        //     }
        //     else
        //         xor = 0;
        // }
        // break;
        // }
        return count;

    }

    // public int subArray(int[] nums,int i ,int j){
    //     int xor = 0;

    //     for(int k = i; k <= j; k++){
    //         xor ^= nums[k];
    //         // System.out.println(xor+" "+i+" "+j);
    //     }

    //     return xor;
    // }

    // public int subArray()

    // public int returnBinary(int a){
    //     int[] binaryNumber = new int[1000];
    //     int i = 0; 
        
    //     while(a > 0){
    //         binaryNumber[i] = a%2;
    //         a = a/2;
    //         i++;
    //     }

    //     return Array.toString(binaryNumber);
    // }

    // public int findK(String a, String b){
    //     int len = Math.min(a.length(), b.length());
        
    //     for(int k = 0; k < len; k++){
    //         if(a[k] == b[k] == 1)
    //             return k;
    //     }

    //     return -1;
    // }


}