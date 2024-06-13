package algos.educative.fastAndSlowPointers;

public class CycleDetection {
    static class LinkedListNode {
        public int data;
        public LinkedListNode next;

        // Constructor will be used to make a LinkedListNode type object
        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Template for the linked list
    static class LinkedList<T> {
        public LinkedListNode head;

        // constructor will be used to make a LinkedList type object
        public LinkedList() {
            this.head = null;
        }

        // insertNodeAtHead method will insert a LinkedListNode at head
        // of a linked list.
        public void insertNodeAtHead(LinkedListNode node) {
            if (this.head == null) {
                this.head = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
        }

        // createLinkedList method will create the linked list using the
        // given integer array with the help of InsertAthead method.
        public void createLinkedList(int[] lst) {
            for (int i = lst.length - 1; i >= 0; i--) {
                LinkedListNode newNode = new LinkedListNode(lst[i]);
                insertNodeAtHead(newNode);
            }
        }

        // returns the node at the specified position(index) of the linked list
        public static LinkedListNode getNode(LinkedListNode head, int pos) {
            LinkedListNode ptr = head;
            if (pos != -1) {
                int p = 0;

                while (p < pos) {
                    ptr = ptr.next;
                    p += 1;
                }

                return ptr;
            }
            return ptr;
        }

        // returns the number of nodes in the linked list
        public static int getLength(LinkedListNode head) {
            LinkedListNode temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }


    }

    public static boolean detectCycle(LinkedListNode head) {
        if (head == null) {
            return false;
        }
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] lst = new int[] {6,1,0,5,1,6};
        linkedList.createLinkedList(lst);
//        LinkedListNode lastNode = LinkedList.getNode(linkedList.head, 4);
//        lastNode.next = LinkedList.getNode(linkedList.head, 0);
//        detectCycle(linkedList.head);
//        reverse(linkedList.head);
        palindrome(linkedList.head);

    }

    public static LinkedListNode reverse(LinkedListNode head) {
        // Initialize previous and follow pointers as NULL
        LinkedListNode previous = null;
        LinkedListNode follow = null;

        // Point current to the head node
        LinkedListNode current = head;

        // Iterate through the list until we reach the end
        while (current != null) {
            // Store the next node in the follow pointer
            follow = current.next;

            // Reverse the link of the current node to point to the previous node
            current.next = previous;

            // Move previous to the current node
            previous = current;

            // Move current to the follow node
            current = follow;
        }

        // Update the head to the last node, which is now the first node
        head = previous;

        // Return the head of the reversed linked list
        return head;
    }

    public static boolean palindrome(LinkedListNode head) {

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        LinkedListNode reversed = reverse(slow);

        return compare(head, reversed);
    }

    static boolean compare(LinkedListNode head, LinkedListNode reversed) {
        while (head != null && reversed != null) {
            if (head.data != reversed.data) return false;
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }
}
