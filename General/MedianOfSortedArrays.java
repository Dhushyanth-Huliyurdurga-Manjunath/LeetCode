public class MedianOfSortedArrays {
    public static void main(String[] args){
        Solution44 sol = new Solution44();
        int[] a = {1, 2};
        int[] b = {3, 4}; 

        double result = sol.findMedianSortedArrays(a, b);
        System.out.println(result);
    }
}

class Solution44 {
    public int[] returnMergedArray(int[] array, int[] nums1, int[] nums2){
        int idx = 0, i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                array[idx] = nums1[i];
                i++;
                idx++;
            }
            else{
                array[idx] = nums2[j];
                j++;
                idx++;
            }
        }

        while(i < nums1.length){
            array[idx] = nums1[i];
            i++;
            idx++;
        }

        while(j < nums2.length){
            array[idx] = nums2[j];
            j++;
            idx++;
        }

        return array;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalArray = new int[(nums1.length + nums2.length)];

        finalArray = returnMergedArray(finalArray, nums1, nums2);

        double median = 0;
        int size = finalArray.length;

        // for(int i: finalArray){
        //     System.out.println(i+" ");
        // }
        
        if(size % 2 == 1){
            median = finalArray[size / 2];
        }        
        else{
            // System.out.println(finalArray[size/2] + finalArray[size/2 - 1]);
            median = (double)(finalArray[size/2] + finalArray[size/2 - 1]) / 2;
        }

        return median;
    }
}