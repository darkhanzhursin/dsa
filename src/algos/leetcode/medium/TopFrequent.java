package algos.leetcode.medium;

import java.util.*;

public class TopFrequent {
    public static void main(String[] args) {
        topKFrequentBest(new int[] {1,1,1,2,2,3}, 2);
    }
    static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) return nums;
        Arrays.sort(nums);
        Map<Integer, Integer> myMap = new HashMap<>();
        int count = 1;
        int[] res = new int[k];

        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i])) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
                else break;
            }
            myMap.put(nums[i], count);
            count = 1;
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = myMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .toList();
        for (int i = 0; i < k; i++) {
            res[i] = sortedEntries.get(i).getKey();
        }

        return res;
    }

    static int[] topKFrequentBest(int[] nums, int k) {
        // 1. Use a Counter collection for frequency counts - this produces the same outcome as our verbose implementation in the brute force approach.
        Map<Integer,Integer> counterMap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            counterMap.put(nums[i], counterMap.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> heap= new PriorityQueue<>(k,Comparator.comparing(el->el.getValue()));

        for(Map.Entry<Integer,Integer> entry: counterMap.entrySet()){
            heap.offer(entry);

            if(heap.size()>k){
                heap.poll();
            }
        }
        int[]  arr= new int[k];
        for (int i=0;i<k;i++){
            arr[i]=heap.poll().getKey();
        }
        return arr;
    }}
