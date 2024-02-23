package stack;

public class MyIntStack {

    private static final int MAX_SIZE = 10;
    private Integer[] arr;
    private int size;

    public MyIntStack() {
        arr = new Integer[MAX_SIZE];
        size = 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void push(Integer element) throws StackException {
        if (element == null) {
            throw new IllegalArgumentException("Null is not allowed");
        }

        if (isFull()) {
            throw new StackException("Stack is full. Cannot push an element.");
        }

        arr[size++] = element;
    }

    public Integer pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty. Cannot pop element");
        }

        Integer poppedElement = arr[--size];
        arr[size] = null;
        return poppedElement;
    }

    public Integer peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty. Cannot peek element.");
        }
        return arr[size-1];
    }
}
