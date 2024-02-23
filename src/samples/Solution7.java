package samples;

import java.util.ArrayList;
import java.util.List;

public class Solution7 {

    public int lengthBumpy(int n) {
        List<Integer> nums = new ArrayList();
        nums.add(n);
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                nums.add(n);
            } else {
                n = n * 3 + 1;
                nums.add(n);
            }
        }

        return nums.size();
    }
}
