package algos.hackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeArray {

    public static void main(String[] args) {
        equalizeArray(List.of(1, 2, 3, 1, 2, 3, 3, 3));
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int key = arr.get(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;

        for (Integer i : map.values()) {
            maxCount = Math.max(maxCount, i);
            sum += i;
        }
        return sum - maxCount;
    }
}
