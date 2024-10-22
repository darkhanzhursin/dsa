package algos.miu.lab7;

import java.util.Arrays;

public class BottomUpHeap {
    private int[] heap;
    private int size;

    // Constructor that builds a heap from an array using bottom-up heap construction
    public BottomUpHeap(int[] array) {
        this.size = array.length;
        this.heap = bottomUpHeap(array);
    }

    // Function to implement the BottomUpHeap algorithm based on the provided pseudocode
    private int[] bottomUpHeap(int[] A) {
        // Base case: if the array has 1 or fewer elements, return it as a heap
        if (A.length <= 1) {
            return A;
        }

        // Step 1: Remove the first key (root)
        int k = A[0]; // First element (root)
        A = Arrays.copyOfRange(A, 1, A.length); // Remove the first element

        // Step 2: Split A into two subarrays A1 and A2 of equal length
        int mid = A.length / 2;
        int[] A1 = Arrays.copyOfRange(A, 0, mid); // Left half
        int[] A2 = Arrays.copyOfRange(A, mid, A.length); // Right half

        // Step 3: Recursively heapify both halves
        int[] T1 = bottomUpHeap(A1);
        int[] T2 = bottomUpHeap(A2);

        // Step 4: Merge the two heaps by creating a binary tree with root k
        int[] merged = mergeHeaps(k, T1, T2);

        // Step 5: Perform downheap from the root if necessary
        downheap(merged, 0);

        return merged;
    }

    // Helper function to merge two heaps into one with root k
    private int[] mergeHeaps(int root, int[] left, int[] right) {
        int[] merged = new int[1 + left.length + right.length];
        merged[0] = root; // Root element

        // Copy elements from left subtree
        System.arraycopy(left, 0, merged, 1, left.length);

        // Copy elements from right subtree
        System.arraycopy(right, 0, merged, 1 + left.length, right.length);

        return merged;
    }

    // Function to perform the downheap operation to maintain the heap property
    private void downheap(int[] heap, int i) {
        int n = heap.length;
        int smallest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // Check if the left child is smaller than the current node
        if (leftChild < n && heap[leftChild] < heap[smallest]) {
            smallest = leftChild;
        }

        // Check if the right child is smaller than the current smallest node
        if (rightChild < n && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }

        // If the smallest is not the current node, swap and continue downheap
        if (smallest != i) {
            swap(heap, i, smallest);
            downheap(heap, smallest);  // Recursively heapify the affected subtree
        }
    }

    // Utility function to swap two elements in the heap
    private void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Function to print the heap
    public void printHeap() {
        System.out.println(Arrays.toString(heap));
    }

    // Main method to test the Bottom-Up Heap construction
    public static void main(String[] args) {
        // Input sequence: 11, 5, 2, 3, 17, 24, 1
        int[] values = {11, 5, 2, 3, 17, 24, 1};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(values));

        // Build a heap using the Bottom-Up Heap construction algorithm
        BottomUpHeap minHeap = new BottomUpHeap(values);

        System.out.println("Heap after bottom-up construction:");
        minHeap.printHeap();
    }
}
