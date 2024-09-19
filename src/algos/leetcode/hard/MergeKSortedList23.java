package algos.leetcode.hard;

import java.util.PriorityQueue;

public class MergeKSortedList23 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        //node1.next.next = new ListNode(5);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        //node2.next.next = new ListNode(4);

//        ListNode node3 = new ListNode(2);
//        node3.next = new ListNode(6);

        ListNode[] arr = new ListNode[]{node1, node2};
        mergeKLists(arr);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode l : lists) {
            if (l != null) pq.add(l);
        }

        ListNode dummy = new ListNode(-1);
        ListNode point = dummy;
        while (!pq.isEmpty()) { // pq: [1, 1, 2]
            point.next = pq.poll(); // [1, 2]
            point = point.next; // 1
            if (point.next != null) {
                pq.add(point.next); // [1, 2, ]
            }
        }
        return dummy.next;
    }
}
