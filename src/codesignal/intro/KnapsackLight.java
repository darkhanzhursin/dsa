package codesignal.intro;

public class KnapsackLight {
    int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        // Check if only one item can be taken
        if (weight1 + weight2 <= maxW) return value1 + value2;
        // Check if only one of the items can be taken
        if (weight1 <= maxW && weight2 <= maxW) return Math.max(value1, value2);

        // Choose the item with higher value-to-weight ratio
        double ratio1 = (double)value1 / weight1;
        double ratio2 = (double)value2 / weight2;

        if (ratio1 > ratio2 && weight1 <= maxW) {
            return value1;
        } else if (ratio2 > ratio1 && weight2 <= maxW) {
            return value2;
        } else {
            return 0; // Can't take any item
        }
    }
}
