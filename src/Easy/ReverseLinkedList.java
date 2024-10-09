package Easy;

public class ReverseLinkedList {
    public ListNode reverseLinkedList(ListNode head) {
        ListNode reverse = null, cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = reverse;
            reverse = cur;
            cur = next;
        }
        return reverse;
    }
}
