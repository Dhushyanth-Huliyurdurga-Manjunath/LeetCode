class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int triplets = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(nums[j] - nums[i] == d[/-";"]iff && nums[k] - nums[j] == diff)
                        triplets++;
                }
            }
        }

        // while(true){
        //     int idxI = 0;
        //     int count = 0;
        //     for(int i = idxI; i < nums.length; i++){
        //         for(int j = i+1; j < nums.length; j++){
        //             if(count < 2){
        //                 if((nums[j] - nums[i]) == diff && i < j){
        //                     System.out.println(nums[j]+ " "+nums[i]+" "+i+" "+j);
        //                     idxI = j;
        //                     count++;
        //                     break;
        //                 }
        //             }
        //             else{
        //             count = 0;
        //             triplets++;
        //             idxI = 1;
        //             break;
        //             }
        //         }
        //     }
        //     break;
        // }

        return triplets;
    }
}