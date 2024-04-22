package algos.leetcode.hard;

public class TrappingRainWater {

    public static void main(String[] args) {
        trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
    }

    static int trap(int[] height) {
        int i = 0;
        int sum = 0;
        int leftMax = height[0];
        int j = height.length - 1;
        int rightMax = height[j];

        while (i < j) {
            if (leftMax <= rightMax) {
                sum+=(leftMax-height[i]);
                i++;
                leftMax=Math.max(leftMax,height[i]);
            } else {
                sum+=(rightMax-height[j]);
                j--;
                rightMax=Math.max(rightMax,height[j]);
            }
        }
        return sum;
    }
}
