package algos.educative.binarySearch;

import java.util.*;
import java.util.stream.Collectors;

public class KClosest {

    public static void main(String[] args) {
        System.out.println(findClosestElements(new int[] {1,2,3,4}, 2, 3));
    }

    static List<Integer> usingBS(int[] nums, int k, int target) {
        List<Integer> closestElements = new ArrayList<>();

        if (nums.length == k) {
            for (int num : nums) {
                closestElements.add(num);
            }
            return closestElements;
        }

        if (target <= nums[0]) {
            for (int i = 0; i < k; i++) {
                closestElements.add(nums[i]);
            }
            return closestElements;
        }

        if (target >= nums[nums.length - 1]) {
            for (int i = nums.length - k; i < nums.length; i++) {
                closestElements.add(nums[i]);
            }
            return closestElements;
        }

        int firstClosest = BinarySearch.binarySearch(nums, target);
        int windowLeft = firstClosest - 1;
        int windowRight = firstClosest + 1;

        while ((windowRight - windowLeft - 1) < k) {
            if (windowLeft == -1) {
                windowRight++;
                continue;
            }

            if (windowRight == nums.length || Math.abs(nums[windowLeft] - target) <= Math.abs(nums[windowRight] - target)) {
                windowLeft--;
            }
            else {
                windowRight++;
            }
        }
        for (int i = windowLeft + 1; i < windowRight; i++) {
            closestElements.add(nums[i]);
        }
        return closestElements;
    }

    static List<Integer> findClosestElements(int[] nums, int k, int target) {
        int indexOfTarget = BinarySearch.binarySearch(nums, target);
        Map<Integer, Integer> distances = new HashMap<>();
        for (int n : nums) {
            //if (n == nums[indexOfTarget]) continue;
            int dis = Math.abs(target - n);
            distances.put(n, dis);
        }
        List<Integer> sortedArr = sorted(distances);

        return extracted(sortedArr, k);
    }

    static List<Integer> sorted(Map<Integer, Integer> unsortedMap) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(unsortedMap.entrySet());

        // Sort the list with a custom comparator
        list.sort((e1, e2) -> {
            int valueCompare = e1.getValue().compareTo(e2.getValue());
            if (valueCompare == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return valueCompare;
        });

        List<Integer> sortedKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedKeys.add(entry.getKey());
        }

        return sortedKeys;
    }

    static List<Integer> extracted(List<Integer> sorted, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(sorted.get(i));
        }
        Collections.sort(result);
        return result;
    }
}
