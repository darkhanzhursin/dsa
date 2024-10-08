package algos.miu.sorts.src.sortroutines;

import algos.miu.sorts.src.runtime.Sorter;

public class ShellSort extends Sorter {

    // Shell sort
    public static int[] shellSort(int[] array){
        for (int offset = array.length /2; offset > 0; offset /= 2) {
            for (int i = offset; i < array.length; i++) {
                int index = i;
                for (int j = i - offset; j>=0; j-= offset) {
                    if(array[j] > array[index]){
                        swap(array, j, index);
                        index = j;
                    }
                }
            }
        }
        return array;
    }

    @Override
    public int[] sort(int[] arr) {
        return shellSort(arr);
    }

    // Swapping two elements
    static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
