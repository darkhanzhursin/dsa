package algos.leetcode.medium;

import java.util.*;

public class KthSmallestPrimeFraction {
    public static void main(String[] args) {
        int[] res = kthSmallestPrimeFraction(new int[] {1,2,3,5}, 3);
        System.out.println(Arrays.toString(res));
    }
    static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        TreeMap<Double, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double fraction = (double) arr[i] / arr[j];
                map.put(fraction, List.of(arr[i], arr[j]));
            }
        }

        Set<Map.Entry<Double, List<Integer>>> entrySet = map.entrySet();
        List<Map.Entry<Double, List<Integer>>> entryList = new ArrayList<>(entrySet);
        return entryList.get(k-1).getValue().stream().mapToInt(Integer::intValue).toArray();
    }
}
