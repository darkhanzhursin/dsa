package algos.codesignal.intro;

public class SortByHeight {

    static int[] solution(int[] a) {

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] != -1 && a[j] != -1) {
                    if (a[i] > a[j]) {
                        int temp = 0;
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        solution(new int[] {-1, 150, 190, 170, -1, -1, 160});
    }
}
