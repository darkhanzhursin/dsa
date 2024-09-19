package algos.hackerRank;

import java.util.*;

public class ActiveTraders {

    public static void main(String[] args) {
        //divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2));
        //solution(List.of("Alpha", "Beta", "Beta", "Omega"));
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) integerList.add(i);
        rotateLeft(4, integerList);
    }

    static private List<String> solution(List<String> customers) {
        Map<String, Integer> customerCount = new HashMap<>();

        // Count occurrences of each customer
        for (String customer : customers) {
            customerCount.put(customer, customerCount.getOrDefault(customer, 0) + 1);
        }

        // Filter active customers
        List<String> activeCustomers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : customerCount.entrySet()) {
            if (entry.getValue() * 100 >= customers.size() * 5) {
                activeCustomers.add(entry.getKey());
            }
        }

        // Sort and return the list of active customers
        Collections.sort(activeCustomers);
        return activeCustomers;
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int counter = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) counter++;
            }
        }

        return counter;
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int hourGlassSum = 0;
        int maxHourGlassSum = Integer.MIN_VALUE;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){

                hourGlassSum = calculateHourGlass(arr, i, j);

                if(hourGlassSum > maxHourGlassSum){
                    maxHourGlassSum = hourGlassSum;
                }
            }
        }

        return maxHourGlassSum;
    }

    private static int calculateHourGlass(List<List<Integer>> arr, int i, int j) {
        int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

        return sum;
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        while (d > 0) {
            int i = arr.remove(0);
            arr.add(i);
            d--;
        }
        return arr;
    }
}
