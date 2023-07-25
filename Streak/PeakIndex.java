class Solution59 {

    //O(log(arr.length)) solution
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }



        //O(arr.length) or brute force solution
        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i - 1] < arr[i]){
        //         idx = i;
        //         continue;
        //     }
        // }

        return end;

    }
}