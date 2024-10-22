package algos.miu.lab8;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumIII {
    public static List<List<Integer>> subsetSum(int[] nums, int k){
        return subsetSumRec(new ArrayList<>(), new ArrayList<>(), nums, 0, k);
    }

    private static List<List<Integer>> subsetSumRec(List<List<Integer>> ret,
                                                    List<Integer> subset, int[] nums, int i, int k) {
        if(k < 0) //for improvement 2
            return ret;
        else if(k == 0) { //changed k
            ret.add(new ArrayList<>(subset));
            return ret;
        }
        //base case
        if(i == nums.length) {
            return ret;
        }

        //first self call
        subsetSumRec(ret, subset, nums, i + 1, k);

        //second self call
        subset.add(nums[i]);
        subsetSumRec(ret, subset, nums, i + 1, k - nums[i]); //changed k
        //clean up
        subset.remove(subset.size()-1);//backtracking//clean up//maintain the status

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,4};
        System.out.println(subsetSum(nums, 6));
    }
}
