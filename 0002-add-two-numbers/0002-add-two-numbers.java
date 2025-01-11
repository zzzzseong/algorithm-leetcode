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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;

        while(!Objects.isNull(l1) || !Objects.isNull(l2) || carry != 0) {
            int digit1 = !Objects.isNull(l1) ? l1.val : 0;
            int digit2 = !Objects.isNull(l2) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(digit);
            tail.next = node;
            tail = node;

            l1 = !Objects.isNull(l1) ? l1.next : null;
            l2 = !Objects.isNull(l2) ? l2.next : null;
        }

        return head.next;
    }
}