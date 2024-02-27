package leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConcatenation {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = Arrays.copyOf(nums, 2 * nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }

    public static int[] getConcatenation2(int[] nums) {
        int p[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            p[i]=nums[i];
        }
        int n=nums.length+p.length;
        List<Integer> m=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            m.add(nums[i]);

        }
        for(int j=0;j<p.length;j++)
        {
            m.add(p[j]);
        }
        int[] arr = m.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public static void main(String[] args) {
        getConcatenation2(new int[] {1, 2, 1});
    }
}
