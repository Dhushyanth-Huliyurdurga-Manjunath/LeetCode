package Algorithms;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 8/7/23 03:24 PM
 */

/**
 * Min-Heap implementation
 * */

public class MinHeap {

    static int heapSize = 0;

    //Array not required as the method returns only the index
    //and we know the left, right, and parent index for any
    //index i
    public static int left(int idx){
        return 2 * idx + 1;
    }

    public static int right(int idx){
        return 2 * idx + 2;
    }

    public int parent(int idx){
        return (int) Math.floor((double) (idx - 1) / 2);
    }

    public static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void buildMinHeap(int[] array){
        heapSize = array.length;
        for(int i = (int) Math.floor((double) (array.length - 1) / 2); i >= 0; i--){
            minHeapify(array,i);
        }
    }
    public static void minHeapify(int[] array, int idx){
        int l = left(idx);
        int r = right(idx);
        int smallest = idx;

        if(l < heapSize && array[l] < array[idx]){
            smallest = l;
        }
        if(r < heapSize && array[r] < array[smallest]){
            smallest = r;
        }

        if(smallest != idx){
            swap(idx, smallest, array);
            minHeapify(array, smallest);
        }
    }

    public static void heapSort(int[] array){
        buildMinHeap(array);
        for(int i = array.length - 1; i >= 0; i--){
            swap(i, 0, array);
            heapSize = heapSize - 1;
            minHeapify(array, 0);
        }
    }
    public static void main(String[] args){
        int[] values = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};

        //in-place sorting hence no requirement of additional storage to store the sorted values
        // heapSort(values);
        buildMinHeap(values);

        for(int i :values){
            System.out.print(i+ " ");
        }
    }
}
