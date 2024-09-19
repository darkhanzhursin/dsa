package algos.leetcode.hard;

public class TrappingRainWater {

    public static void main(String[] args) {
        trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(maxWater(new int[] {6,9,9}, 3));
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

    static int maxWater(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        int l_max = 0;
        int r_max = 0;

        int result = 0;

        while (left <= right) {
            if (r_max <= l_max) {
                result += Math.max(0, r_max - arr[right]);
                r_max = Math.max(r_max, arr[right]);
                right--;
            } else {
                result += Math.max(0, l_max - arr[left]);
                l_max = Math.max(l_max, arr[left]);
                left++;
            }
        }

        return result;
    }


}
