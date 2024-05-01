package algos.leetcode.medium;
import java.util.Arrays;
import java.util.Stack;
public class CarFleet {
    public static void main(String[] args) {
        carFleet(12, new int[] {10,8,0,5,3}, new int[] {2,4,1,1,3});
    }
    static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 1) return 1;
        Stack<Double> stack = new Stack<>();
        int[][] posAndSpeed = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            posAndSpeed[i][0] = position[i];
            posAndSpeed[i][1] = speed[i];
        }

        Arrays.sort(posAndSpeed, java.util.Comparator.comparingInt(o -> o[0]));
        for (int i = posAndSpeed.length - 1; i >= 0; i--) {
            double currentTime = (double) (target - posAndSpeed[i][0]) / posAndSpeed[i][1];
            if (!stack.isEmpty() && currentTime <= stack.peek()) {
                continue;
            } else {
                stack.push(currentTime);
            }
        }


        return stack.size();
    }
}
