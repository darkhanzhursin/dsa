package algos.miu.lab8;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    public static void main(String[] args) {
        List<List<int[]>> res = findSubsets(new int[]{1, 2, 3}, new int[]{10, 20, 30}, 5, 20);
        for (List<int[]> subset : res) {
            System.out.print("{ ");
            for (int[] item : subset) {
                System.out.print("(Weight: " + item[0] + ", Value: " + item[1] + ") ");
            }
            System.out.println("}");
        }
    }

    private static List<List<int[]>> findSubsets(int[] weights, int[] values, int maxWeight, int minValue) {
        List<List<int[]>> res = new ArrayList<>();
        List<int[]> subset = new ArrayList<>();
        backtrack(weights, values, maxWeight, minValue, 0, subset, 0, 0, res);
        return res;
    }

    private static void backtrack(int[] weights, int[] values, int W, int V, int index,
                                                 List<int[]> currSubset, int currWeight, int currValue,
                                                 List<List<int[]>> result) {

        if (currWeight > W) return;
        if (currValue >= V) {
            result.add(new ArrayList<>(currSubset));
        }

        if (index == weights.length) {
            return;
        }

       backtrack(weights, values, W, V, index + 1, currSubset, currWeight, currValue, result);

        currSubset.add(new int[]{weights[index], values[index]});

        backtrack(weights, values, W, V, index + 1, currSubset, currWeight + weights[index],
                currValue + values[index], result);
        currSubset.remove(currSubset.size() - 1);
    }


    public List<List<Integer>> knaspsack(int[] weights, int[] values, int maxWeight, int minValue) {
        return knapsackRec(new ArrayList<>(), new ArrayList<>(), 0, weights, values, maxWeight, minValue);
    }

    private List<List<Integer>> knapsackRec(List<List<Integer>> ret, List<Integer> subset, int i, int[] weights,
                                            int[] values, int maxW, int minV) {
        // base case

        if (i == values.length) {
            if (sum(weights, subset) <= maxW && sum(values, subset) >= minV) {
                ret.add(new ArrayList<>(subset));
            }
        }
        // recoursive calls
        knapsackRec(ret, subset, i + 1, weights, values, maxW, minV);

        subset.add(i);
        knapsackRec(ret, subset, i + 1, weights, values, maxW, minV);
        subset.remove(subset.size() - 1);

        return ret;
    }


//    private List<List<Integer>> knapsackRecImp(List<List<Integer>> ret, List<Integer> subset, int i, int[] weights,
//                                            int[] values, int maxW, int minV) {
//        // base case
//
//
//        if (maxW < 0) {
//            return ret;
//        }
//        if (i == values.length) {
//            if (minV <= 0) {
//                ret.add(new ArrayList<>(subset));
//            }
//        }
//        // recoursive calls
//        knapsackRecImp(ret, subset, i + 1, weights, values, maxW, minV);
//
//        subset.add(i);
//        knapsackRecImp(ret, subset, i + 1, weights, values, maxW - weights[i], minV - values[i]);
//        subset.remove(subset.size() - 1);
//
//        return ret;
//    }



    private  int sum(int[] arr, List<Integer> subset) {
        int sum = 0;
        for (int i : subset) {
            sum += arr[i];
        }

        return sum;
    }

}
