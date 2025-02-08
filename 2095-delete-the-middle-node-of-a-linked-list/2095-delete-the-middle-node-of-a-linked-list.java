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
    public ListNode deleteMiddle(ListNode head) {
        ListNode next = head.next;

        int size = 1;
        while(!Objects.isNull(next)) {
            next = next.next;
            size++;
        }

        if(size == 1) return null;

        ListNode node = head;
        for(int i=0; i<size/2; i++) {
            if(i != size/2-1) {
                node = node.next;
                continue;
            }
        
            if(node.next != null) node.next = node.next.next;
        }
        
        return head;
    }
}