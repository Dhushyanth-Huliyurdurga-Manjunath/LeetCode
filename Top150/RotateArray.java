package Top150;

class Solution38 {
    public void rotate(int[] nums, int k) {
        int[] rotatedArray = new int[nums.length];
        int size = nums.length;

        /*Working code below
        * but works well for smaller input array
        * and takes a lot of time for larger arrays
        * So, not an efficient approach, but works*/

        // for(int i = 0; i < k; i++){
        //     int temp = nums[nums.length - 1];
        //     for(int j = nums.length - 1; j > 0; j--){
        //         nums[j] = nums[j - 1];
        //     }
        //     nums[0] = temp;
        // }

        /*Working solution above*/

        k = k % nums.length;

        /*Saw this implementation in one of the solution as
        * I was stuck figuring out how to optimize or make
        * it efficient for larger input, first you need to
        * reverse the whole array and then reverse the first
        * 'k' elements and then reverse the k+1 to nth elements
        * this would result in the conclusion we are looking for.*/

        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
    }

    /*User-defined method to reverse elements of an array
    * from index 'start' to 'end'*/
    public void reverseArray(int[] array, int start, int end){
        while(start < end){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            end--;
            start++;
        }
    }
}
public class RotateArray {
    public static void main(String[] args){
        /*Creating an object for class 'Solution38'
        * as to access its methods*/
        Solution38 sol = new Solution38();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        //Printing the initial array
        System.out.print("Before rotating: ");
        for(int i: nums){
            System.out.print(i+" ");
        }

        //method call to rotate 'nums', 'k' times.
        sol.rotate(nums, k);

        //Printing the final array after rotation
        System.out.print("\nAfter rotating: ");
        for(int i: nums){
            System.out.print(i+" ");
        }
    }
}
