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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0, head);
        ListNode prev = temp, curr = head;

        while (curr != null && curr.next != null) {
            ListNode first = curr.next.next;
            ListNode sec = curr.next;

            sec.next = curr;
            curr.next = first;
            prev.next = sec;

            prev = curr;
            curr = first;
        }

        return temp.next;      
    }
}