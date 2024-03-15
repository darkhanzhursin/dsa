package fpp.homeworks.lesson9.prob1;

public class ArrayQueueImpl {
    private int[] arr;
    private int front;
    private int rear;

    public ArrayQueueImpl(int n) {
        arr = new int[n];
        front = -1;
        rear = 0;
    }

    public ArrayQueueImpl() {
        this(10);
    }

    public void enqueue(int obj) {
        if (rear == arr.length - 1) {
            resize();
        }
        arr[rear] = obj;
        rear++;
    }

    public void resize() {
        System.out.println("resizing");
        int len = arr.length;
        int newLen = 2 * len;
        int[] newArray = new int[newLen];
        System.arraycopy(arr, 0, newArray, 0, len);
        arr = newArray;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int first = arr[++front];
        front--;
        moveElements(arr);
        rear--;
        return first;
    }

    private void moveElements(int[] arr) {
        int k = 0;
        while (arr[k] != 0) {
            arr[k] = arr[k+1];
            k++;
        }
    }
    public boolean isEmpty() {
        return rear == 0;
    }

    public int size() {
        return rear;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front+1];
    }

    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(10);
        System.out.println("Deleted: " + arrayQueue.dequeue());
        arrayQueue.enqueue(11);
        System.out.println("Size: " + arrayQueue.size());
        System.out.println("Peek: " + arrayQueue.peek());
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.peek();
    }
}
