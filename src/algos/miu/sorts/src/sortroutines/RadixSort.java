package algos.miu.sorts.src.sortroutines;

import algos.miu.sorts.src.runtime.Sorter;

import java.util.ArrayList;
import java.util.List;

public class RadixSort extends Sorter {

    @Override
    public int[] sort(int[] arr) {
        return radixSort(arr);
    }

    // Radix sort
    public static int[] radixSort(int[] array){
        // positive and negative buckets
        List<List<Integer>> buckets = new ArrayList<List<Integer>>();
        for(int i=0; i<10*2; i++)
            buckets.add(new ArrayList<Integer>());
        int index = 0;
        do{
            // clear
            for(List<Integer> bucket: buckets)
                bucket.clear();
            // bucket-in
            for (int i=0; i<array.length; i++) {
                int value = array[i];
                int bucketIndex = getDigit(value, index) +10;
                buckets.get(bucketIndex).add(value);
            }
            // check
            if(buckets.get(10).size() == array.length)
                break;
            // bucket-out
            List<Integer> bucket = buckets.get(0);
            int bucketIndex = 0;
            for (int i=0; i<array.length; i++) {
                while(bucket.isEmpty())
                    bucket = buckets.get(++bucketIndex);
                array[i] = bucket.remove(0);
            }
            index++;
        } while(true);
        return array;
    }

    private static int getDigit(int value, int index){
        long exp = 1;
        for(int i=0;i<index;i++)
            exp*=10;
        return ((int)((double)value/exp))%10;
    }
}
