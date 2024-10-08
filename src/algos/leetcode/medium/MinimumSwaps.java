package algos.leetcode.medium;

public class MinimumSwaps {
    public static int minSwaps(String s) {

        char open = '[';
        char closed = ']';
        int c = 0;
        char[] fChar = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;


        if (fChar[i] == closed && fChar[j] == open) {
            swap(fChar, i, j);
            c++;
            i++;
            j--;
        }
        while (i < j) {
            if (fChar[i] == closed && fChar[j] == open){
                if(fChar[i-1]==open && fChar[j+1]==closed){
                    i++;j--;
                }else {
                    swap(fChar, i, j);
                    i++;
                    j--;
                    c++;
                }
            } else {
                i++;
                j--;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "]]][[[";
        System.out.println(minSwaps(s));
    }
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
