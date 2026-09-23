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
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode curr= head;

        if(head==null) return head;

        while(curr.next!=null){
            c++;
            curr=curr.next;
        }

        curr=head;

        for(int i= 0; i<(c+1)/2; i++) {
            curr=curr.next;
        }

        return curr;
    }
}