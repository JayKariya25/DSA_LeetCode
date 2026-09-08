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
    public boolean isPalindrome(ListNode head) {
        ListNode front= head;
        List<Integer> n= new ArrayList();

        while(front!=null) {
            n.add(front.val);
            front= front.next;
        }

        int l= 0;
        int r= n.size()-1;

        
        while(l<r && n.get(l)==n.get(r)) {
            l++;
            r--;
        }

        return l>=r;
    }
}