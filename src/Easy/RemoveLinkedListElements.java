package Easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sHead = new ListNode(), sTail = sHead, cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = null;

            if (cur.val != val) {
                sTail.next = cur;
                sTail = cur;
            }

            cur = next;
        }
        return sHead.next;
    }
}
