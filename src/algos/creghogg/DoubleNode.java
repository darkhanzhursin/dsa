package algos.creghogg;

public class DoubleNode {

    static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node tail = head;

        // O(1)
        display(insertAtBeginning(head, tail, 3));
    }

    private static void display(Node head) {
        Node current = head;
        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    private static Node insertAtBeginning(Node head, Node tail, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    private static Node insertAtEnd(Node head, Node tail, int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.prev = tail;
        return newNode;
    }
}
