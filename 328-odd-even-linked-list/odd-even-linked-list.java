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
    public ListNode oddEvenList(ListNode head) {
        while(head==null || head.next==null) return head;

        ListNode temp=head;

        ArrayList<Integer> odd= new ArrayList<>();
        ArrayList<Integer> even= new ArrayList<>();

        int i=1;

        while(temp!=null) {
            if(i%2==0) even.add(temp.val);
            if(i%2!=0) odd.add(temp.val);
            i++;
            temp= temp.next;
        }

        int j= 0;
        temp=head;
        while(j<odd.size() && temp!=null) {
            temp.val=odd.get(j);
            temp=temp.next;
            j++;
        }

        int k=0;

        while(k<even.size() && temp!=null) {
            temp.val= even.get(k);
            temp=temp.next;
            k++;
        }

        return head;
    }
}