package Algorithms;
public class QuickSort {
    public static void main(String[] args){
        int[] nums = {23, 4, 6, 2, 5, 454, 11};

        QuickSort qos = new QuickSort();
        qos.quickSort(nums, 0, nums.length-1);

        for (int n :
                nums) {
            System.out.print(n+" ");
        }
    }

    public int[] returnSortedArray(int[] array, int low, int high){
        QuickSort qsObject = new QuickSort();
        qsObject.quickSort(array, low, high);

        return array;
    }

    public int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low -1;

        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }

    public void swap(int[] array, int j, int i){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public void quickSort(int[] array, int low, int high){
        if(low < high){
            int j = partition(array, low, high);
            quickSort(array, low, j-1);
            quickSort(array, j+1, high);
        }
    }
}
