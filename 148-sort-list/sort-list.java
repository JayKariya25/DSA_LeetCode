class Solution {
    public ListNode sortList(ListNode head) {
        
        ArrayList<Integer> a= new ArrayList<>();

        if(head==null || head.next==null) return head;
        ListNode curr=head;

        while(curr!=null) {
            a.add(curr.val);
            curr= curr.next;
        }

        Collections.sort(a);
        curr=head;
        int i=0;

        while(curr!=null) {
            curr.val= a.get(i);
            i++;
            curr= curr.next;
        }

        return head;
    }
}