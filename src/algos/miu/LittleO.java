package algos.miu;

public class LittleO {
    public static void main(String[] args) {
        countZerosAndOnes(new int[] {0, 0, 0, 0, 1, 1, 1, 1});
    }
    public static void countZerosAndOnes(int[] A) {
        int n = A.length;

        // If the entire array is filled with 0s
        if (A[n - 1] == 0) {
            System.out.println("Number of 0s: " + n);
            System.out.println("Number of 1s: 0");
            return;
        }

        // If the entire array is filled with 1s
        if (A[0] == 1) {
            System.out.println("Number of 0s: 0");
            System.out.println("Number of 1s: " + n);
            return;
        }

        // Binary search to find the index of the first 1
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the first occurrence of 1
            if (A[mid] == 1 && (mid == 0 || A[mid - 1] == 0)) {
                // Number of 0s is equal to the index of the first 1
                System.out.println("Number of 0s: " + mid);
                System.out.println("Number of 1s: " + (n - mid));
                return;
            } else if (A[mid] == 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
    }
}
