class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode beforeLeft = null;
        ListNode curr = head;

        // Move curr to the left position
        int i = 1;

        while (i < left) {
            beforeLeft = curr;
            curr = curr.next;
            i++;
        }

        // This will become the tail of reversed section
        ListNode leftNode = curr;

        ListNode prev = null;

        // Reverse from left to right
        while (i <= right) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;

            i++;
        }

        // Connect prefix to reversed section
        if (beforeLeft != null) {
            beforeLeft.next = prev;
        } else {
            head = prev;
        }

        // Connect reversed section to remaining list
        leftNode.next = curr;

        return head;
    }
}