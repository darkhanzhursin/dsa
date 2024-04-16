package algos.faang;

import java.util.Arrays;

/*
* [1, 2, 3] [+, -, *, \]
* */
public class FindMax {
    public double findMax(double[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        double tmpMin = arr[0];
        double tmpMax = arr[0];
        double mins[] = new double[4];
        double maxs[] = new double[4];

        for (int i = 1; i < arr.length; i++) {
            mins[0] = tmpMin - arr[i];
            maxs[0] = tmpMax - arr[i];

            mins[1] = tmpMin + arr[i];
            maxs[1] = tmpMax + arr[i];

            mins[2] = tmpMin * arr[i];
            maxs[2] = tmpMax * arr[i];

            if (arr[i] != 0) {
                mins[3] = tmpMin / arr[i];
                maxs[3] = tmpMax / arr[i];
            }

            tmpMax = Math.max(max(mins), max(maxs));
            tmpMin = Math.min(min(mins), min(maxs));
        }
        return tmpMax;
    }

    double max(double[] arr) {
        return Arrays.stream(arr).max().orElse(Double.MIN_VALUE);
    }

    double min(double[] arr) {
        return Arrays.stream(arr).min().orElse(Double.MAX_VALUE);
    }
}
