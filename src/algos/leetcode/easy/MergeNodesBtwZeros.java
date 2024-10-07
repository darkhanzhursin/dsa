package algos.leetcode.easy;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) {
        val = x;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeNodesBtwZeros {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        mergeNodes(head);
    }

    public static ListNode mergeNodes(ListNode head) {
        // Initialize a pointer for the new linked list
       ListNode dummyHead = new ListNode(0); // Dummy node to simplify the list creation
       ListNode cur = dummyHead;

        // Temporary pointer to traverse the original list
        ListNode temp = head.next; //Skip the first zero
        int sum = 0;

        while (temp != null) {
            if (temp.val == 0) {
                // Encounter a 0, create a new node with the current sum and reset sum
                cur.next = new ListNode(sum);
                cur = cur.next;
                sum = 0; // Reset the sum for the next group
            } else {
                // Accumulate the sum for nodes between two 0's
                sum += temp.val;
            }
            temp = temp.next;
        }
        return dummyHead.next;
    }
}
