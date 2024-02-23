package samples;

public class Solution5 {
    public int[] f(int[] first, int[] second) {

        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[0];
        int min = (first.length < second.length) ? first.length : second.length;
        int[] a, b;
        if (min == first.length) {
            a = first;
            b = second;
        }
        else {
            a = second;
            b = first;
        }

        int[] c = new int[min];
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (first[i] == second[j]) {
                    c[counter] = a[i];
                    counter++;
                }
            }
        }

        int[] retArr = new int[counter];
        for (int t = 0; t < counter; t++) {
            retArr[t] = c[t];
        }
        return retArr;
    }
}
