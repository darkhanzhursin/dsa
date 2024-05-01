package algos.leetcode.medium;

import java.util.Stack;

public class Find132Pattern {

    public static void main(String[] args) {
        find132Pattern(new int[] {4, 2, 3});
    }

    static boolean find132Pattern(int[] nums) {
        int min=Integer.MIN_VALUE;
        Stack<Integer>stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<min){
                return true;
            }
            while(!stack.isEmpty()&&nums[i]>stack.peek()){
                min= stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
