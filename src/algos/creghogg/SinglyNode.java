package algos.creghogg;

public class SinglyNode {

    static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node A = new Node(3);
        Node B = new Node(4);
        Node C = new Node(7);

        head.next = A;
        A.next = B;
        B.next = C;
        traverse(head);
        System.out.print("null");
        System.out.println();
        boolean res = search(head, 31);
        System.out.println(res);
    }

    // Traverse the list - O(n)
    private static void traverse(Node head) {
        while (head != null) {
            System.out.print(head.value + "->");
            head = head.next;
        }
    }

    private static boolean search(Node head, int value) {
        while (head != null) {
            if (head.value == value) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
