package algos.leetcode.medium;

public class CircularDeque {
    private class Node {
        int val;
        Node prev, next;
        Node(int value) {
            this.val = value;
        }
    }

    private Node front;
    private Node rear;
    private int count;
    private int capacity;

    public CircularDeque(int k) {
        this.capacity = k;
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value); // 3->null
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        count++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            newNode.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        count++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (rear == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        count--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (rear == rear) {
            front = rear = null;
        } else {
            rear = rear.next;
            rear.next = null;
        }
        count--;
        return true;
    }

    public int getFront() {
        if (!isEmpty()) {
            return front.val;
        }
        return -1;
    }

    public int getRear() {
        if (!isEmpty()) {
            return rear.val;
        }
        return -1;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}
