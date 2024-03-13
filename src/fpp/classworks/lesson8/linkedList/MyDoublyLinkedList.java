package fpp.classworks.lesson8.linkedList;

public class MyDoublyLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int x ) {
            val = x;
        }
    }

    int numberOfNodes;
    ListNode head, tail;

    public MyDoublyLinkedList() {
        numberOfNodes = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public void addAtHead(int val) {
        ListNode pred = head;
        ListNode succ = head.next;
        connectToNewNode(val, pred, succ);
    }

    public void addAtTail(int val) {
        ListNode succ = tail;
        ListNode pred = tail.prev;
        connectToNewNode(val, pred, succ);
    }
    public void addAtIndex(int index, int val) {
        if (index > numberOfNodes) return;
        if (index < 0) index = 0;
        ListNode pred, succ;
        if (index < numberOfNodes - index) {
            pred = head;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            succ = pred.next;
        } else {
            succ = tail;
            for (int i = 0; i < numberOfNodes - index; i++) {
                succ = succ.prev;
            }
            pred = succ.prev;
        }
        connectToNewNode(val, pred, succ);
    }

    private void connectToNewNode(int val, ListNode pred, ListNode succ) {
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= numberOfNodes) return;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode succ = pred.next.next;
        pred.next = succ;
        succ.prev = pred;
        --numberOfNodes;
    }

    public int get(int index) {
        if (index < 0 || index >= numberOfNodes) return -1;
        ListNode curr = head;
        if (index + 1 < numberOfNodes - index) {
            for (int i = 0; i < index + 1; i++) {
                curr = curr.next;
            }
        } else {
            curr = tail;
            for (int i = 0; i < numberOfNodes - index; i++) {
                curr = curr.prev;
            }
        }
        return curr.val;
    }

    public static void main(String[] args) {
        MyDoublyLinkedList doublyLinkedList = new MyDoublyLinkedList();
        doublyLinkedList.addAtHead(9);
        doublyLinkedList.deleteAtIndex(0);
        doublyLinkedList.addAtTail(4);
        System.out.println("At index 0: " + doublyLinkedList.get(0));
        doublyLinkedList.addAtHead(2);
        doublyLinkedList.addAtTail(5);
    }
}
