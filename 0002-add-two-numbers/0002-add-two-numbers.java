class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node for easier handling
        ListNode curr = dummyHead;

        int carry = 0; // Variable to store carry over between digits

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Initialize sum with carry over

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Calculate carry over for next digit
            curr.next = new ListNode(sum % 10); // Create new node with current digit
            curr = curr.next;
        }

        return dummyHead.next; // Skip the dummy node and return the actual list
    }
}
