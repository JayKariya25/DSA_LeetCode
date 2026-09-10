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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> a= new ArrayList<>();

        if(head==null || head.next==null) return head;

        ListNode curr=head;

        while(curr!= null) {
            a.add(curr.val);
            curr= curr.next;
        }

        left= left-1;
        right= right-1;
        int temp;

        while(left<right){
            temp= a.get(left);
            a.set(left, a.get(right));
            a.set((right), temp);

            left++;
            right--;
        }

        curr=head;
        int i=0;

        while(curr!= null) {
            curr.val= a.get(i);
            curr= curr.next;

            i++;
        }

        return head;

    }
}