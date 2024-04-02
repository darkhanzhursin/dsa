package miu.fpp.classworks.lesson9StackQueue;

public class LinkedQueue {
    class Node {
        Object data;
        Node next;
        Node(Object item) {
            data = item;
        }
    }

    Node front, rear;
    int count;
    public void enqueue(Object item) {
        Node p = new Node(item);
        if (isEmpty()) {
            front = rear = p;
        } else {
            rear.next = p;
            rear = p;
        }
        count++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Q is empty");
            return null;
        }
        Object item = front.data;
        front = front.next;
        count--;
        return item;
    }
    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return count;
    }

    public void display() {
        Node p = front;
        System.out.println("Linked Q: ");
        if (p == null) System.out.println("empty");
        while (p != null) {
            System.out.println(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.enqueue('A');
        q.enqueue('B');
        q.enqueue('C');
        q.display();

//        Queue<Integer> qlist = new LinkedList<>();
//        qlist.add(42);
//        qlist.add(3);
//        qlist.add(17);
//        System.out.println(qlist.remove());
    }
}
