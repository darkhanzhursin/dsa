package algos.miu.sorts.src.sortroutines;

import algos.miu.sorts.src.runtime.Sorter;

public class HeapSort extends Sorter {

    @Override
    public int[] sort(int[] arr) {
        return heapSort(arr);
    }

    // Heap sort
    public static int[] heapSort(int[] array){
        // make heap
        int hsize;
        for(hsize = 1; hsize < array.length; hsize++){
            heapfyUp(array, hsize, hsize);
        }
        // remove heap
        while(--hsize != 0){
            swap(array, 0, hsize);
            heapfyDown(array, hsize -1, 0);
        }
        return array;
    }

    private static void heapfyDown(int[] array, int hsize, int index){
        if(index*2 + 1 <= hsize){
            int child = index*2 + 1;
            if(index*2 +2 <= hsize && array[child] < array[index*2+2])
                child = index*2 + 2;
            if(array[child]>array[index]){
                swap(array, index, child);
                heapfyDown(array, hsize, child);
            }
        }
    }

    private static void heapfyUp(int[] array, int hsize, int index){
        int parent = (index %2 ==0)?((index-2)/2):((index-1)/2);
        if(parent >= 0){
            if(array[index] > array[parent]){
                swap(array, index, parent);
                heapfyUp(array, hsize, parent);
            }
        }
    }

    // Swapping two elements
    static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
